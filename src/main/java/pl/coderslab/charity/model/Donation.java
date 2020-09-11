package pl.coderslab.charity.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Data
@Entity
public class Donation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private Integer quantity;
    @ManyToMany
    private List<Category> categories;
    @ManyToOne
    private Institution institution;
    private String street;
    private String city;
    @Pattern(regexp = "^\\d{2}[- ]\\d{3}$")
    private String zipCode;
    private LocalDate pickUpDate;
    private LocalTime pickUpTime;
    private String pickUpComment;

}
