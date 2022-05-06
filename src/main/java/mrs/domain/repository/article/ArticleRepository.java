package mrs.domain.repository.article;

import mrs.domain.model.Article;
import mrs.domain.model.VisibleStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ArticleRepository extends JpaRepository<Article, Integer> {
    List<Article> findByVisibleStatus(VisibleStatus visibleStatus);
}
