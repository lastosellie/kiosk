package kiosk.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import kiosk.SalesApplication;
import lombok.Data;

@Entity
@Table(name = "Sales_table")
@Data
//<<< DDD / Aggregate Root
public class Sales {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Date saleDate;

    private String saleAmount;

    private String menuPrice;

    public static SalesRepository repository() {
        SalesRepository salesRepository = SalesApplication.applicationContext.getBean(
            SalesRepository.class
        );
        return salesRepository;
    }

    //<<< Clean Arch / Port Method
    public static void salesPlus(OrderAccepted orderAccepted) {
        Sales sales = new Sales();
        repository().save(sales);
        //implement business logic here:

        /** Example 1:  new item 
        Sales sales = new Sales();
        repository().save(sales);

        */

        /** Example 2:  finding and process
        
        repository().findById(orderAccepted.get???()).ifPresent(sales->{
            
            sales // do something
            repository().save(sales);


         });
        */


       

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
