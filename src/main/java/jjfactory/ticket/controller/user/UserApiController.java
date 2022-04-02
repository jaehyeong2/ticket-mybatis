package jjfactory.ticket.controller.user;

import jjfactory.ticket.domain.user.User;
import jjfactory.ticket.dto.CommonRes;
import jjfactory.ticket.dto.SignUpDto;
import jjfactory.ticket.service.user.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequiredArgsConstructor
@RestController
public class UserApiController {
    private final UserServiceImpl userService;

    @ResponseBody
    @PostMapping("/signup")
    public CommonRes<?> signUp(@RequestBody SignUpDto signUpDto){
        User user = signUpDto.toEntity();
        userService.join(user);
        log.info("UserController : user id = {} email = {} ,",user.getUsername(),user.getEmail());
        return new CommonRes<>(HttpStatus.OK.value(),user);
    }
}
