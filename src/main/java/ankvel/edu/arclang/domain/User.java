package ankvel.edu.arclang.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;

/**
 * @author Aleksey Kovalenko
 */
@Entity
@Data
@Table(name = "arc_user")
@SequenceGenerator(name="arc_user_seq", sequenceName = "arc_user_seq", allocationSize=100)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "arc_user_seq")
    private Long id;

    private String name;

    @JsonIgnore
    private String pass;
}
