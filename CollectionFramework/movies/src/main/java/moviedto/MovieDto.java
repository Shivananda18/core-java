package moviedto;

import lombok.*;

import javax.management.ConstructorParameters;

@Getter
@Setter
@ToString
public class MovieDto {

    private  long id;
    private String movieName;
    private  float ratings;

}
