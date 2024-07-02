package kiosk.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

//<<< EDA / CQRS
@Entity
@Table(name = "MenuPage_table")
@Data
public class MenuPage {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private String menuId;
    private String menuName;
    private String menuPrice;
    private String menuStatus;
}
