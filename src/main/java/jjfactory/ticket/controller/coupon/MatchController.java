package jjfactory.ticket.controller.coupon;

import jjfactory.ticket.service.match.MatchServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/match")
@RequiredArgsConstructor
@Controller
public class MatchController {
    private final MatchServiceImpl matchService;
}
