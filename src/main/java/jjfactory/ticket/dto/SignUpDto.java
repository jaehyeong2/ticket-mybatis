package jjfactory.ticket.dto;

import jjfactory.ticket.domain.user.User;
import jjfactory.ticket.domain.user.enums.EventAgreement;
import jjfactory.ticket.domain.user.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class SignUpDto {

    private String name;
    private String username;  //아이디
    private String password;
    private String email;
    private EventAgreement eventAgreement;
    private String marketingAgreement;
    private Gender gender;

    public User toEntity(){
        return User.builder()
                .name(name)
                .username(username)
                .password(password)
                .email(email)
                .eventAgreement(eventAgreement)
                .gender(gender)
                .build();
    }
}
