package pl.coderslab.charity.model;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Data
@Entity
public class Donation implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private Integer quantity;
    @ManyToMany
    @Size(min = 1)
    private List<Category> categories;
    @ManyToOne
    private Institution institution;
    @NotEmpty
    private String street;
    @NotEmpty
    private String city;
    @Pattern(regexp = "^\\d{2}-\\d{3}$")
    private String zipCode;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Future
    private LocalDate pickUpDate;
    private LocalTime pickUpTime;
    private String pickUpComment;

}
