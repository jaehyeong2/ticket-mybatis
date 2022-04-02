package jjfactory.ticket.config.auth;

import jjfactory.ticket.domain.user.User;
import jjfactory.ticket.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    private final UserMapper userMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userMapper.findByUsername(username);
        log.info("로그인 시도 : {}",user);
        if(user == null){
            log.info("널임시발");
            return null;
        }else{
            return new UserDetailsImpl(user);
        }
    }
}
