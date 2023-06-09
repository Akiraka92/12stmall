package stmall.domain;

import java.util.*;
import lombok.Data;
import stmall.infra.AbstractEvent;

@Data
public class DeliveryStarted extends AbstractEvent {

    private Long id;
    private Long orderId;
    private Long productId;
    private Integer qty;
    private String status;
    private String productName;
}
