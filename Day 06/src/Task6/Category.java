package Task6;

public class Category {
    private Integer categoryId;
    private String categoryName;

    public Category(Integer categoryId, String name) {
        this.categoryId = categoryId;
        this.categoryName = name;
    }

    public Integer getCategoryId() {
        return categoryId;
    }
    public String getCategoryName() {
        return categoryName;
    }
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }
    public void setName(String name) {
        this.categoryName = name;
    }

    @Override
    public String toString() {
        return "Category{" +
                "categoryId=" + categoryId +
                ", name='" + categoryName + '\'' +
                '}';
    }
}

