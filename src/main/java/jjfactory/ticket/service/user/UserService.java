package jjfactory.ticket.service.user;

import jjfactory.ticket.domain.user.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface UserService {

    User findById(Long id);

    List<User> findAll();

    @Transactional
    void insert();

    @Transactional
    void deleteById();

    @Transactional
    void updateById();
}
