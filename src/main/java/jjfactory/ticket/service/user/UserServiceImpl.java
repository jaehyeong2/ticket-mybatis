package jjfactory.ticket.service.user;

import jjfactory.ticket.domain.user.User;
import jjfactory.ticket.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Transactional(readOnly = true)
public class UserServiceImpl implements UserService {

    private final UserMapper userMapper;

    @Override
    public User findById(Long id){
        return null;
    }

    @Override
    public List<User> findAll(){
        return null;
    }

    @Transactional
    @Override
    public void insert(){

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
