package jjfactory.ticket.controller;

import jjfactory.ticket.service.user.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@RequiredArgsConstructor
@Controller
public class UserController {

    private final UserServiceImpl userService;
}
