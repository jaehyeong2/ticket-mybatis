package jjfactory.ticket.config.auth;

import jjfactory.ticket.domain.user.User;
import jjfactory.ticket.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    private final UserMapper userMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User admin = userMapper.findByUsername(username);

        if(admin == null){
            return null;
        }else{
            return new UserDetailsImpl(admin);
        }
    }
}
