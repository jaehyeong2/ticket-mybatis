package jjfactory.ticket.controller.order;

import jjfactory.ticket.service.oders.OrderServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/order")
@RequiredArgsConstructor
@Controller
public class OrderController {
    private final OrderServiceImpl orderService;
}
