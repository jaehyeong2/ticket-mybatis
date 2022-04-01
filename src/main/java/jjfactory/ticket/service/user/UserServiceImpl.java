package jjfactory.ticket.service.user;

import jjfactory.ticket.domain.user.User;
import jjfactory.ticket.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Transactional(readOnly = true)
@Service
public class UserServiceImpl implements UserService {

    private final UserMapper userMapper;

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
        userMapper.insertUser(user);
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
