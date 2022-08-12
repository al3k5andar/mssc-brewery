package guru.springframework.msscbrewery.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Null;
import javax.validation.constraints.Size;
import java.util.UUID;

/**
 * Created by jt on 2019-04-21.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CustomerDto {

    @Null
    private UUID id;

    @NotBlank
    @Size(min = 3, max = 100, message = "Customer name must be between 3 and 100 characters long.")
    private String name;
}
