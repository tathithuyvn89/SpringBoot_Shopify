package com.example.market.service.image;

import com.example.market.model.Image;
import com.example.market.model.Product;
import com.example.market.service.IGeneralService;

public interface IImageService extends IGeneralService<Image> {
    Iterable<Image> findAllByProduct(Product product);
}
