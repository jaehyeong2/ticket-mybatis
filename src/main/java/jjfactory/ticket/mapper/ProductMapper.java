package jjfactory.ticket.mapper;

import jjfactory.ticket.domain.product.Product;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductMapper {
    Product findById(Long id);
    List<Product> findAll();
}
