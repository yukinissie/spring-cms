package mrs.app.article;

import mrs.domain.model.Article;
import mrs.domain.service.article.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("articles")
public class ArticlesController {
    @Autowired
    ArticleService articleService;

    @RequestMapping(method = RequestMethod.GET)
    String listArticles(Model model) {
        List<Article> articles = articleService.findPublicArticles();
        model.addAttribute("articles", articles);
        return "article/listArticles";
    }
}
