package mall.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Mypage_table")
@Data
public class Mypage {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private String orderId;
    private String itemId;
    private Integer qty;
    private String address;
    private String customerId;
    private String status;
}
