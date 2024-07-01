package kiosk.domain;

import java.time.LocalDate;
import java.util.*;
import kiosk.infra.AbstractEvent;
import lombok.Data;

@Data
public class OrderAccepted extends AbstractEvent {

    private Long id;
    private String tableId;
    private String menuId;
    private String munuState;
    private String menuPrice;
}
