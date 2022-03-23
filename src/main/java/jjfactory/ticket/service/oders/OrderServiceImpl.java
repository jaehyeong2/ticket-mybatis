package jjfactory.ticket.service.oders;

import jjfactory.ticket.domain.user.User;
import jjfactory.ticket.mapper.OrderMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Transactional(readOnly = true)
@Service
public class OrderServiceImpl implements OrderService {

    private final OrderMapper orderMapper;

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
