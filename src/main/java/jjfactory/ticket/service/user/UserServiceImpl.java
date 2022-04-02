package jjfactory.ticket.service.user;

import jjfactory.ticket.domain.user.User;
import jjfactory.ticket.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Transactional(readOnly = true)
@Service
public class UserServiceImpl implements UserService {

    private final UserMapper userMapper;
    private final BCryptPasswordEncoder encoder;

    @Override
    public User findById(Long id){
        return userMapper.getUserById(id);
    }

    @Override
    public List<User> findAll(){
        return userMapper.getUserList();
    }

    @Transactional
    @Override
    public void join(User user) {
        String rawPassword = user.getPassword();
        String encoded = encoder.encode(rawPassword);
        user.encodePassword(encoded);

        userMapper.join(user);
        log.info("UserService : username = {} email = {}",user.getUsername(),user.getEmail());
        log.info("UserService : name= {} password= {}",user.getName(),user.getPassword());
    }

    @Transactional
    @Override
    public void deleteById(){

    }

    @Transactional
    @Override
    public void updateById(){

    }

}
