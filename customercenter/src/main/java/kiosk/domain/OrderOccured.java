package kiosk.domain;

import java.time.LocalDate;
import java.util.*;
import kiosk.infra.AbstractEvent;
import lombok.Data;

@Data
public class OrderOccured extends AbstractEvent {

    private Long id;
    private String tableId;
    private String menuId;
    private String menuStatus;
    private String menuPrice;
    private String menuName;
}
