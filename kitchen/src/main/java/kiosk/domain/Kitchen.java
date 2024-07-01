package kiosk.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import kiosk.KitchenApplication;
import kiosk.domain.OrderAccepted;
import kiosk.domain.OrderRejected;
import lombok.Data;

@Entity
@Table(name = "Kitchen_table")
@Data
//<<< DDD / Aggregate Root
public class Kitchen {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String tableId;

    private String menuId;

    private String munuState;

    private String menuPrice;

    @PostPersist
    public void onPostPersist() {
        OrderAccepted orderAccepted = new OrderAccepted(this);
        orderAccepted.publishAfterCommit();

        OrderRejected orderRejected = new OrderRejected(this);
        orderRejected.publishAfterCommit();
    }

    public static KitchenRepository repository() {
        KitchenRepository kitchenRepository = KitchenApplication.applicationContext.getBean(
            KitchenRepository.class
        );
        return kitchenRepository;
    }

    //<<< Clean Arch / Port Method
    public static void orderOccur(OrderOccured orderOccured) {
        //implement business logic here:

        /** Example 1:  new item 
        Kitchen kitchen = new Kitchen();
        repository().save(kitchen);

        OrderAccepted orderAccepted = new OrderAccepted(kitchen);
        orderAccepted.publishAfterCommit();
        OrderRejected orderRejected = new OrderRejected(kitchen);
        orderRejected.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(orderOccured.get???()).ifPresent(kitchen->{
            
            kitchen // do something
            repository().save(kitchen);

            OrderAccepted orderAccepted = new OrderAccepted(kitchen);
            orderAccepted.publishAfterCommit();
            OrderRejected orderRejected = new OrderRejected(kitchen);
            orderRejected.publishAfterCommit();

         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
