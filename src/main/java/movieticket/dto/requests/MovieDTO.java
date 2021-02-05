package movieticket.dto.requests;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.util.Set;

@Data
public class MovieDTO {
    @NotBlank
    private String movieName;

    @NotBlank
    private String movieRating;

    @NotBlank
    private String viewerRating;

    @NotBlank
    private String language;

    private Set<String> tags;

    //TODO: add cast, directed by, produced by and summary, if added to entities
}
