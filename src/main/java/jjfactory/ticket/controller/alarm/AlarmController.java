package jjfactory.ticket.controller.alarm;

import jjfactory.ticket.service.alarm.AlarmServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/alarm")
@RequiredArgsConstructor
@Controller
public class AlarmController {
    private final AlarmServiceImpl alarmService;
}
