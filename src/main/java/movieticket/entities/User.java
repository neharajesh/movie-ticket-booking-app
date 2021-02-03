package movieticket.entities;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Email
    private String email;

    @NotBlank
    @Size(min = 3, max = 15)
    private String password;

    @NotBlank
    @Size(min = 3, max = 45)
    private String fullName;

    @NotBlank
    private Integer age;

    @NotBlank
    private String phoneNo;

    //TODO: add role
}
