package jjfactory.ticket.dto;

import jjfactory.ticket.domain.user.User;
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
    private String eventAgreement;
    private String marketingAgreement;

    public User toEntity(){
        return User.builder()
                .name(name)
                .username(username)
                .password(password)
                .email(email)
                .eventAgreement(eventAgreement)
                .marketingAgreement(marketingAgreement)
                .build();
    }
}
