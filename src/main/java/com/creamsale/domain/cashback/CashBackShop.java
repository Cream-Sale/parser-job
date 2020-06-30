package com.creamsale.domain.cashback;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import javax.persistence.*;

@Entity
@Table(name = "CashBackShop")
public class CashBackShop {

    private Integer id;
    private String cashBackName;
    private String shopName;
    private String sale;
    private String descriptions;

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
    @Column(name = "cashBackName", length = 100)
    public String getCashBackName() {
        return cashBackName;
    }

    public void setCashBackName(String cashBackName) {
        this.cashBackName = cashBackName;
    }

    @Basic
    @Column(name = "shopName", length = 100)
    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    @Basic
    @Column(name = "sale", length = 10)
    public String getSale() {
        return sale;
    }

    public void setSale(String sale) {
        this.sale = sale;
    }

    @Basic
    @Column(name = "descriptions")
    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (!(o instanceof CashBackShop)) return false;

        CashBackShop that = (CashBackShop) o;

        return new EqualsBuilder()
                .append(getId(), that.getId())
                .append(getCashBackName(), that.getCashBackName())
                .append(getShopName(), that.getShopName())
                .append(getSale(), that.getSale())
                .append(getDescriptions(), that.getDescriptions())
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(getId())
                .append(getCashBackName())
                .append(getShopName())
                .append(getSale())
                .append(getDescriptions())
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
                .append("id", id)
                .append("cashBackName", cashBackName)
                .append("shopName", shopName)
                .append("sale", sale)
                .append("descriptions", descriptions)
                .toString();
    }
}
