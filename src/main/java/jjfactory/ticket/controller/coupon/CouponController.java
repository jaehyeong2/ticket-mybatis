package jjfactory.ticket.controller.coupon;

import jjfactory.ticket.service.coupon.CouponServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/coupon")
@RequiredArgsConstructor
@Controller
public class CouponController {
    private final CouponServiceImpl couponService;
}
