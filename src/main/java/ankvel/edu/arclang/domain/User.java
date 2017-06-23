package ankvel.edu.arclang.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Aleksey Kovalenko
 */
@Entity
@Data
@Table(name = "arc_user")
public class User {
    @Id
    @GeneratedValue
    private Long id;

    private String name;
}
