package jjfactory.ticket.mapper;

import jjfactory.ticket.domain.user.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("select * from User WHERE id = #{id}")
    User getUserById(@Param("id") Long id);

    @Select("SELECT * FROM User")
    @Results(id="UserMap", value = {
            @Result(property = "name",column = "name"),
            @Result(property = "email",column = "email")
    })
    List<User> getUserList();

//    @Options(useGeneratedKeys = true, keyProperty = "user_id")
    void join(User user);

    User findByUsername(String username);
}
