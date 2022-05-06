package mrs.domain.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "article")
public class Article {
    @Id
    private String articleId;

    private String title;

    private String body;

    @OneToOne
    private Category category;

    @OneToMany
    private List<Tag> tags;

    @Enumerated(EnumType.STRING)
    private VisibleStatus visibleStatus;

    public String getArticleId() {
        return articleId;
    }

    public void setArticleId(String articleId) {
        this.articleId = articleId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public VisibleStatus getVisibleStatus() {
        return visibleStatus;
    }

    public void setVisibleStatus(VisibleStatus visibleStatus) {
        this.visibleStatus = visibleStatus;
    }
}
