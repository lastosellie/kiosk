package kiosk.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import kiosk.TableApplication;
import kiosk.domain.OrderOccured;
import lombok.Data;

@Entity
@Table(name = "Table_table")
@Data
//<<< DDD / Aggregate Root
public class Table {

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
        //    TableApplication.applicationContext.getBean(kiosk.external.ㅡenuService.class)
        //    .getㅡenu(/** mapping value needed */);
    }

    public static TableRepository repository() {
        TableRepository tableRepository = TableApplication.applicationContext.getBean(
            TableRepository.class
        );
        return tableRepository;
    }

    //<<< Clean Arch / Port Method
    public static void updateMenuStatus(OrderRejected orderRejected) {
        //implement business logic here:

        /** Example 1:  new item 
        Table table = new Table();
        repository().save(table);

        */

        /** Example 2:  finding and process
        
        repository().findById(orderRejected.get???()).ifPresent(table->{
            
            table // do something
            repository().save(table);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
