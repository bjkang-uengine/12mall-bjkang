package mall.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import mall.DeliveryApplication;
import mall.domain.DeliveryCanceled;

@Entity
@Table(name = "Delivery_table")
@Data
public class Delivery {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String address;

    private Integer qty;

    private String itemId;

    private String orderId;

    private String customerId;

    private String status;

    @PostPersist
    public void onPostPersist() {
        DeliveryCanceled deliveryCanceled = new DeliveryCanceled(this);
        deliveryCanceled.publishAfterCommit();
    }

    public static DeliveryRepository repository() {
        DeliveryRepository deliveryRepository = DeliveryApplication.applicationContext.getBean(
            DeliveryRepository.class
        );
        return deliveryRepository;
    }

    public void deliveryComplet() {
        //implement business logic here:

        DeliveyCompleted deliveyCompleted = new DeliveyCompleted(this);
        deliveyCompleted.publishAfterCommit();
    }

    public void deliveryStart() {
        //implement business logic here:

        DeliveryStarted deliveryStarted = new DeliveryStarted(this);
        deliveryStarted.publishAfterCommit();
    }

    public void returnDelivery() {
        //implement business logic here:

        DeliveryReturned deliveryReturned = new DeliveryReturned(this);
        deliveryReturned.publishAfterCommit();
    }

    public static void deliveryList(OrderPlaced orderPlaced) {
        //implement business logic here:

        /** Example 1:  new item 
        Delivery delivery = new Delivery();
        repository().save(delivery);

        */

        /** Example 2:  finding and process
        
        repository().findById(orderPlaced.get???()).ifPresent(delivery->{
            
            delivery // do something
            repository().save(delivery);


         });
        */

    }

    public static void deliveryCancel(OrderCancelled orderCancelled) {
        //implement business logic here:

        /** Example 1:  new item 
        Delivery delivery = new Delivery();
        repository().save(delivery);

        DeliveryCanceled deliveryCanceled = new DeliveryCanceled(delivery);
        deliveryCanceled.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(orderCancelled.get???()).ifPresent(delivery->{
            
            delivery // do something
            repository().save(delivery);

            DeliveryCanceled deliveryCanceled = new DeliveryCanceled(delivery);
            deliveryCanceled.publishAfterCommit();

         });
        */

    }
}
