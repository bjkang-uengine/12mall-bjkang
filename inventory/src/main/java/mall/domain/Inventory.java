package mall.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import mall.InventoryApplication;
import mall.domain.StockDecresed;
import mall.domain.StockIncreased;

@Entity
@Table(name = "Inventory_table")
@Data
public class Inventory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Integer stock;

    @PostPersist
    public void onPostPersist() {
        StockDecresed stockDecresed = new StockDecresed(this);
        stockDecresed.publishAfterCommit();

        StockIncreased stockIncreased = new StockIncreased(this);
        stockIncreased.publishAfterCommit();
    }

    public static InventoryRepository repository() {
        InventoryRepository inventoryRepository = InventoryApplication.applicationContext.getBean(
            InventoryRepository.class
        );
        return inventoryRepository;
    }

    public static void decreaseStock(DeliveyCompleted deliveyCompleted) {
        //implement business logic here:

        /** Example 1:  new item 
        Inventory inventory = new Inventory();
        repository().save(inventory);

        StockDecresed stockDecresed = new StockDecresed(inventory);
        stockDecresed.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(deliveyCompleted.get???()).ifPresent(inventory->{
            
            inventory // do something
            repository().save(inventory);

            StockDecresed stockDecresed = new StockDecresed(inventory);
            stockDecresed.publishAfterCommit();

         });
        */

    }

    public static void increaseStock(DeliveryReturned deliveryReturned) {
        //implement business logic here:

        /** Example 1:  new item 
        Inventory inventory = new Inventory();
        repository().save(inventory);

        StockIncreased stockIncreased = new StockIncreased(inventory);
        stockIncreased.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(deliveryReturned.get???()).ifPresent(inventory->{
            
            inventory // do something
            repository().save(inventory);

            StockIncreased stockIncreased = new StockIncreased(inventory);
            stockIncreased.publishAfterCommit();

         });
        */

    }
}
