package jjfactory.ticket.mapper;

import jjfactory.ticket.domain.team.Team;
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

    @Insert("INSERT INTO User(username,name,password,email,phone,gender,eventAgreement,marketingAgreement)" +
            " VALUES ( #{user.username},#{user.name},#{user.password},#{user.email},#{user.phone}, " +
            "#{user.gender},#{user.eventAgreement},#{user.marketingAgreement}) ")
    @Options(useGeneratedKeys = true, keyProperty = "user_id")
    Long insertUser(@Param("user") User user);

}
