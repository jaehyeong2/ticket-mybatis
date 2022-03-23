package jjfactory.ticket.domain.user;

import jjfactory.ticket.domain.user.enums.Gender;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class User {
    private Long id;
    private String username;
    private String name;
    private String email;
    private String phone;

    private Gender gender;

    private String eventAgreement; //이벤트 동의 여부
    private String marketingAgreement;// 마케팅 동의 여부

    private LocalDateTime createDate;
    private LocalDateTime updatedDate;
}
