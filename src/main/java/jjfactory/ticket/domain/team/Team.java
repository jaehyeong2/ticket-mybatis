package jjfactory.ticket.domain.team;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class Team {

    private Long team_id;

    private String name;

    private LocalDateTime createDate;

    private LocalDateTime modifyDate;

}
