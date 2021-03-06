package movieticket.dto.requests;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Set;

@Data
public class SignUpDTO {
    @NotBlank
    @Size(min = 3, max = 45)
    private String fullName;

    @NotBlank
    private String phoneNo;

    @NotBlank
    private Integer age;

    @NotBlank
    @Email
    private String email;

    @NotBlank
    @Size(min = 3, max = 15)
    private String password;

    private Set<String> role;
}
