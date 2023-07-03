package mall.domain;

import java.util.*;
import lombok.Data;
import mall.infra.AbstractEvent;

@Data
public class OrderPlaced extends AbstractEvent {

    private Long id;
    private String itemId;
    private Integer qty;
    private String address;
    private String customerId;
}
