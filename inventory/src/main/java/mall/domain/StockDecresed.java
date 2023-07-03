package mall.domain;

import java.util.*;
import lombok.*;
import mall.domain.*;
import mall.infra.AbstractEvent;

@Data
@ToString
public class StockDecresed extends AbstractEvent {

    private Long id;
    private Integer stock;

    public StockDecresed(Inventory aggregate) {
        super(aggregate);
    }

    public StockDecresed() {
        super();
    }
}
