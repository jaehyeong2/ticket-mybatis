package jjfactory.ticket.controller.user;

import jjfactory.ticket.domain.user.User;
import jjfactory.ticket.dto.CommonRes;
import jjfactory.ticket.dto.SignUpDto;
import jjfactory.ticket.mapper.UserMapper;
import jjfactory.ticket.service.user.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RequiredArgsConstructor
@Controller
public class UserController {

    private final UserServiceImpl userService;
    private final UserMapper userMapper;

    @GetMapping("/")
    public String home(){
        return "home";
    }

    @GetMapping("/signin")
    public String signinForm(){
        return "auth/signin";
    }

    @GetMapping("/signup")
    public String signupForm(){
        return "auth/signup";
    }

    @GetMapping("user/{id}")
    public String userDetail(@PathVariable Long id){
        return null;
    }

}
