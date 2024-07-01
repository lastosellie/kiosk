package kiosk.infra;

import java.io.IOException;
import java.util.List;
import java.util.Optional;
import kiosk.config.kafka.KafkaProcessor;
import kiosk.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class MenuPageViewHandler {

    //<<< DDD / CQRS
    @Autowired
    private MenuPageRepository menuPageRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whenOrderOccured_then_CREATE_1(
        @Payload OrderOccured orderOccured
    ) {
        try {
            if (!orderOccured.validate()) return;

            // view 객체 생성
            MenuPage menuPage = new MenuPage();
            // view 객체에 이벤트의 Value 를 set 함
            menuPage.setMenuId(orderOccured.getMenuId());
            menuPage.setMenuPrice(orderOccured.getMenuPrice());
            menuPage.setMenuName(orderOccured.getMenuName());
            menuPage.setMenuStatus("주문요청");
            // view 레파지 토리에 save
            menuPageRepository.save(menuPage);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @StreamListener(KafkaProcessor.INPUT)
    public void whenOrderAccepted_then_UPDATE_1(
        @Payload OrderAccepted orderAccepted
    ) {
        try {
            if (!orderAccepted.validate()) return;
            // view 객체 조회

            List<MenuPage> menuPageList = menuPageRepository.findByMenuId(
                orderAccepted.getMenuId()
            );
            for (MenuPage menuPage : menuPageList) {
                // view 객체에 이벤트의 eventDirectValue 를 set 함
                menuPage.setMenuStatus("조리중");
                // view 레파지 토리에 save
                menuPageRepository.save(menuPage);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @StreamListener(KafkaProcessor.INPUT)
    public void whenOrderRejected_then_UPDATE_2(
        @Payload OrderRejected orderRejected
    ) {
        try {
            if (!orderRejected.validate()) return;
            // view 객체 조회

            List<MenuPage> menuPageList = menuPageRepository.findByMenuId(
                orderRejected.getMenuId()
            );
            for (MenuPage menuPage : menuPageList) {
                // view 객체에 이벤트의 eventDirectValue 를 set 함
                menuPage.setMenuStatus("취소됨");
                // view 레파지 토리에 save
                menuPageRepository.save(menuPage);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //>>> DDD / CQRS
}
