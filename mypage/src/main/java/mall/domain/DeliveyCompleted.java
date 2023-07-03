package mall.domain;

import java.util.*;
import lombok.Data;
import mall.infra.AbstractEvent;

@Data
public class DeliveyCompleted extends AbstractEvent {

    private Long id;
    private String address;
    private Integer qty;
    private String itemId;
    private String orderId;
    private String customerId;
    private String status;
}
