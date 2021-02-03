package movieticket.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "movie")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String movieName;

    @NotBlank
    private String movieRating;

    @NotBlank
    private String viewerRating;

    @NotBlank
    private String language;

    @NotBlank
    private String genre;

    //TODO: add cast, directed by, produced by and summary
    //TODO: add validations
}
