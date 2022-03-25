package jjfactory.ticket.mapper;

import jjfactory.ticket.domain.team.Team;
import jjfactory.ticket.domain.user.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("select username,user_id from User")
    User getUser();

    @Select("SELECT * FROM User")
    List<User> getUserList();

    @Insert("INSERT INTO user() VALUES ")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertTeam(@Param("") User user);

}
