package mall.domain;

import java.util.*;
import lombok.*;
import mall.domain.*;
import mall.infra.AbstractEvent;

@Data
@ToString
public class UserNotified extends AbstractEvent {

    private Long id;
    private String itemId;
    private Integer qty;
    private String address;
    private String customerId;
    private String status;
    private String message;

    public UserNotified(Order aggregate) {
        super(aggregate);
    }

    public UserNotified() {
        super();
    }
}
