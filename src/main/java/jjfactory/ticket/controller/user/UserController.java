package jjfactory.ticket.controller.user;

import jjfactory.ticket.service.user.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/user")
@RequiredArgsConstructor
@Controller
public class UserController {

    private final UserServiceImpl userService;

    public String user(){
        return null;
    }

    @GetMapping("/detail")
    public String userDetail(){
        return null;
    }


}
