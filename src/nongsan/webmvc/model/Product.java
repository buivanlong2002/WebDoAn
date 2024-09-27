package nongsan.webmvc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUCT")

public class Product {

    private Integer id;
    private String catalog_id;
    private String name;
    private String price;
    private Integer status;
    private String description;
    private String content;
    private String image_link;
    private String created;
    private String discount;

    public Product() {
    }

    public Product(Integer id, String catalog_id, String name, String price, Integer status, String description, String content,
            String discount, String image_link, String created) {
        super();
        this.id = id;
        this.catalog_id = catalog_id;
        this.name = name;
        this.price = price;
        this.status = status;
        this.description = description;
        this.content = content;
        this.discount = discount;
        this.image_link = image_link;
        this.created = created;
    }

    @Id
    @Column(name = "ID")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "CATALOG_ID")
    public String getCatalog_id() {
        return catalog_id;
    }

    public void setCatalog_id(String product_cate) {
        this.catalog_id = product_cate;
    }

    @Column(name = "NAME")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "PRICE")
    public String getPrice() {
        return price;
    }

    public void setPrice(String product_price) {
        this.price = product_price;
    }

    @Column(name = "STATUS")
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Column(name = "DESCRIPTION")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Column(name = "CONTENT")
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Column(name = "DISCOUNT")
    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    @Column(name = "IMAGE_LINK")
    public String getImage_link() {
        return image_link;
    }

    public void setImage_link(String image_link) {
        this.image_link = image_link;
    }

    @Column(name = "CREATED")
    public String getCreated() {
        return created;
    }

    public void setCreated(String product_day) {
        this.created = product_day;
    }

    @Override
    public String toString() {
        return "Product [id=" + id + ", catalog_id=" + catalog_id + ", name=" + name + ", price=" + price + ", status="
                + status + ", description=" + description + ", content=" + content + ", discount=" + discount
                + ", image_link=" + image_link + ", created="
                + created + "]";
    }

}
