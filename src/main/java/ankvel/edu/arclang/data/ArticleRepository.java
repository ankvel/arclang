package ankvel.edu.arclang.data;

import ankvel.edu.arclang.domain.Article;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * @author Aleksey Kovalenko
 */
public interface ArticleRepository extends PagingAndSortingRepository<Article, Long> {
}