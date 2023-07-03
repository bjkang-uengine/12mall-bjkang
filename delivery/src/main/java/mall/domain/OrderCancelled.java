package mall.domain;

import java.util.*;
import lombok.*;
import mall.domain.*;
import mall.infra.AbstractEvent;

@Data
@ToString
public class OrderCancelled extends AbstractEvent {

    private Long id;
    private String itemId;
    private Integer qty;
    private String address;
    private String customerId;
    private String status;
}
