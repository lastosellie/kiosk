package kiosk.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import kiosk.MenuApplication;
import lombok.Data;

@Entity
@Table(name = "ㅡenu_table")
@Data
//<<< DDD / Aggregate Root
public class ㅡenu {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String menuName;

    private String menuPrice;

    private String menuId;

    public static ㅡenuRepository repository() {
        ㅡenuRepository ㅡenuRepository = MenuApplication.applicationContext.getBean(
            ㅡenuRepository.class
        );
        return ㅡenuRepository;
    }
}
//>>> DDD / Aggregate Root
