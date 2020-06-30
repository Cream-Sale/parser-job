package com.creamsale.repositories.shop;

import com.creamsale.domain.shop.ShopProduct;
import org.springframework.data.repository.CrudRepository;

public interface ShopProductRepository extends CrudRepository<ShopProduct, Integer> {
}
