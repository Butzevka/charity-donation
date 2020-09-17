package pl.coderslab.charity.model;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.util.List;
import java.util.Set;

@Data
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Length(min = 2)
    private String firstName;
    @Length(min = 2)
    private String lastName;
    @Email
    private String email;
    @Length(min = 4)
    private String username;
    @Length(min = 4)
    private String password;
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles;
    @ManyToMany
    private List<Donation> donations;
}
