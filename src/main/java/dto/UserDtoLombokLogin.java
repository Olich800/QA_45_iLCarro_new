package dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
@Builder

public class UserDtoLombokLogin {
    private String login;
    private String password;
}
