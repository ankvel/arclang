package ankvel.edu.arclang.domain;

import lombok.Data;

import javax.persistence.*;


/**
 * @author Aleksey Kovalenko
 */
@Entity
@Data
@SequenceGenerator(name="article_seq", sequenceName = "article_seq", allocationSize=100)
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "article_seq")

    private Long id;

    private String title;

    private String content;

    @ManyToOne
    private User author;
}
