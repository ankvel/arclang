package ankvel.edu.arclang.domain;

import lombok.Data;

import javax.persistence.*;


/**
 * @author Aleksey Kovalenko
 */
@Entity
@Data
public class Article {
    @Id
    @GeneratedValue
    private Long id;

    private String title;

    private String content;

    @ManyToOne
    private User author;
}
