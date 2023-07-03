package mall.domain;

import java.util.*;
import lombok.*;
import mall.domain.*;
import mall.infra.AbstractEvent;

@Data
@ToString
public class DeliveryStarted extends AbstractEvent {

    private Long id;
    private String address;
    private Integer qty;
    private String itemId;
    private String orderId;
    private String customerId;
    private String status;
}
