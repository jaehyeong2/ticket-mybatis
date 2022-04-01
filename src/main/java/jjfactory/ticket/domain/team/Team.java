package jjfactory.ticket.domain.team;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
public class Team {

    private Long team_id;
    private String name;
    private LocalDateTime createDate;
    private LocalDateTime modifyDate;

}
