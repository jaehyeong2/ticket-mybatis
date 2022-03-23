package jjfactory.ticket.controller;

import jjfactory.ticket.service.admin.AdminServiceImpl;
import jjfactory.ticket.service.user.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@RequiredArgsConstructor
@Controller
public class AdminController {

    private final AdminServiceImpl adminService;
}
