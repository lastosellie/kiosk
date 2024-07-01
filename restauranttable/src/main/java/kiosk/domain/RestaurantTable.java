package kiosk.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import kiosk.RestauranttableApplication;
import kiosk.domain.OrderOccured;
import lombok.Data;

@Entity
@Table(name = "RestaurantTable_table")
@Data
//<<< DDD / Aggregate Root
public class RestaurantTable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String tableId;

    private String menuId;

    private String menuStatus;

    private String menuName;

    private String menuPrice;

    private Date saleDate;

    @PostPersist
    public void onPostPersist() {
        OrderOccured orderOccured = new OrderOccured(this);
        orderOccured.publishAfterCommit();
        // Get request from ㅡenu
        //kiosk.external.ㅡenu ㅡenu =
        //    RestaurantTableApplication.applicationContext.getBean(kiosk.external.ㅡenuService.class)
        //    .getㅡenu(/** mapping value needed */);
    }

    public static RestaurantTableRepository repository() {
        RestaurantTableRepository restaurantTableRepository = RestauranttableApplication.applicationContext.getBean(
            RestaurantTableRepository.class
        );
        return restaurantTableRepository;
    }

    //<<< Clean Arch / Port Method
    public static void updateMenuStatus(OrderRejected orderRejected) {
        //implement business logic here:

        /** Example 1:  new item 
        RestaurantTable restaurantTable = new RestaurantTable();
        repository().save(restaurantTable);

        */

        /** Example 2:  finding and process
        
        repository().findById(orderRejected.get???()).ifPresent(restaurantTable->{
            
            restaurantTable // do something
            repository().save(restaurantTable);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
