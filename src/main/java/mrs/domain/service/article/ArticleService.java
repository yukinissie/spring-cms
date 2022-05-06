package mrs.domain.service.article;
import mrs.domain.model.Article;
import mrs.domain.model.VisibleStatus;
import mrs.domain.repository.article.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ArticleService {
    @Autowired
    ArticleRepository articleRepository;

    public Article findArticle(Integer articleId) {
        return articleRepository.findById(articleId).orElse(null);
    }

    public List<Article> findPublicArticles() {
        return articleRepository.findByVisibleStatus(VisibleStatus.PUBLIC);
    }
}
