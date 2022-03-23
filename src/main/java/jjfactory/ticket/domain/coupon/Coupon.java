package jjfactory.ticket.domain.coupon;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class Coupon {
    private Long coupon_id;

    private LocalDateTime createDate;
    private LocalDateTime updatedDate;

}
