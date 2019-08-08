package Task6;

public class Product {
    public Integer productId;
    public String name;
    public Integer categoryId;
    public String categoryName;

    public Product(Integer productId, String name, Category categoryId){
        this.productId = productId;
        this.name = name;
        this.categoryId = categoryId.getCategoryId();

    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Integer getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    //    public void setCategoryId(Category categoryId) {
//        this.categoryId = categoryId;
//    }
//        private Category category;
//    public Category getCategory() {
//        return category;
//    }
//
//    public void setCategory(Category category) {
//        this.category = category;
//    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", name='" + name + '\'' +
                ", categoryId=" + categoryId +
                '}';
    }
}
