package movieticket.dto.requests;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
public class LoginDTO {
    @NotBlank
    @Size(min = 3, max = 50)
    private String email;

    @NotBlank
    @Size(min =  3, max = 15)
    private String password;
}
