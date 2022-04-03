package jjfactory.ticket.service.product;

import jjfactory.ticket.domain.product.Product;

import java.util.List;

public interface ProductService {
    Product getProduct(Long id);
    List<Product> getProductList();
}
