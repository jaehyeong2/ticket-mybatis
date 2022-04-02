package jjfactory.ticket.domain.user;

import com.fasterxml.jackson.annotation.JsonValue;
import jjfactory.ticket.domain.user.enums.EventAgreement;
import jjfactory.ticket.domain.user.enums.Gender;
import lombok.Builder;
import lombok.Getter;
import java.time.LocalDateTime;

@Builder
@Getter
public class User {
    private Long user_id;
    private String username;
    private String name;
    private String password;
    private String email;
    private String phone;

    private Gender gender;

    private EventAgreement eventAgreement; //이벤트 동의 여부

    private LocalDateTime createDate;
    private LocalDateTime updatedDate;

    @JsonValue
    public Gender getGender() {
        return gender;
    }
}
