package jjfactory.ticket.domain.admin;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class Admin {

    private Long admin_id;
    private String adminName; // 아이디
    private String password;


    private LocalDateTime createDate;
    private LocalDateTime updatedDate;


}
