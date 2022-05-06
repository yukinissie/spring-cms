package mrs.domain.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "category_name")
public class CategoryName {
    @Id
    private String categoryNameId;

    private String value;

    public String getCategoryNameId() {
        return categoryNameId;
    }

    public void setCategoryNameId(String categoryNameId) {
        this.categoryNameId = categoryNameId;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
