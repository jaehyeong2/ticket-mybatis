package jjfactory.ticket.mapper;

import jjfactory.ticket.domain.team.Team;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface TeamMapper {

    @Select("SELECT * FROM Team")
    List<Team> getTeamList();

    @Insert("INSERT INTO Team() VALUES")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertTeam(@Param("") Team team);
}
