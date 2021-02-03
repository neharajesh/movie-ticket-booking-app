package movieticket.dto.requests;

import lombok.Data;

@Data
public class SignUpDTO {
    private String fullName;
    private String phoneNo;
    private Integer age;
    private String email;
    private String password;

    //TODO: add validations and role
}
