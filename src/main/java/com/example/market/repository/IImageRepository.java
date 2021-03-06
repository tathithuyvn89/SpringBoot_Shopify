package com.example.market.repository;

import com.example.market.model.Image;
import com.example.market.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IImageRepository extends JpaRepository<Image, Long> {
    Iterable<Image> findAllByProduct(Product product);
}
