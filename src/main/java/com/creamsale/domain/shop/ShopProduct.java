package com.creamsale.domain.shop;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import javax.persistence.*;

@Entity
@Table(name = "ShopProduct")
public class ShopProduct {

    private Integer id;
    private String fullName;
    private String brand;
    private String model;
    private String category;
    private String descriptions;
    private String price;
    private String link;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "fullName", length = 150)
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Basic
    @Column(name = "brand", length = 100)
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Basic
    @Column(name = "model", length = 100)
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Basic
    @Column(name = "category", length = 150)
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Basic
    @Column(name = "descriptions")
    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    @Basic
    @Column(name = "price", length = 50)
    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Basic
    @Column(name = "link", length = 256)
    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (!(o instanceof ShopProduct)) return false;

        ShopProduct that = (ShopProduct) o;

        return new EqualsBuilder()
                .append(getId(), that.getId())
                .append(getFullName(), that.getFullName())
                .append(getBrand(), that.getBrand())
                .append(getModel(), that.getModel())
                .append(getCategory(), that.getCategory())
                .append(getDescriptions(), that.getDescriptions())
                .append(getPrice(), that.getPrice())
                .append(getLink(), that.getLink())
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(getId())
                .append(getFullName())
                .append(getBrand())
                .append(getModel())
                .append(getCategory())
                .append(getDescriptions())
                .append(getPrice())
                .append(getLink())
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
                .append("id", id)
                .append("fullName", fullName)
                .append("brand", brand)
                .append("model", model)
                .append("category", category)
                .append("descriptions", descriptions)
                .append("price", price)
                .append("link", link)
                .toString();
    }
}
