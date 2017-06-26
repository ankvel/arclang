package ankvel.edu.arclang.domain.projection;

import ankvel.edu.arclang.domain.Article;
import ankvel.edu.arclang.domain.User;
import org.springframework.data.rest.core.config.Projection;


/**
 * @author Aleksey Kovalenko
 */
@Projection(name = "withAuthor",
        types = {Article.class})
public interface ArticleWithAuthorProjection {
    String getTitle();

    String getContent();

    User getAuthor();
}
