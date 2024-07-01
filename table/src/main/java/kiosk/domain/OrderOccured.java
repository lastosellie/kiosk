package kiosk.domain;

import java.time.LocalDate;
import java.util.*;
import kiosk.domain.*;
import kiosk.infra.AbstractEvent;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class OrderOccured extends AbstractEvent {

    private Long id;
    private String tableId;
    private String menuId;
    private String menuStatus;
    private String menuPrice;
    private String menuName;

    public OrderOccured(Table aggregate) {
        super(aggregate);
    }

    public OrderOccured() {
        super();
    }
}
//>>> DDD / Domain Event
