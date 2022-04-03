package jjfactory.ticket.service.product;

import jjfactory.ticket.domain.product.Product;
import jjfactory.ticket.mapper.ProductMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Transactional(readOnly = true)
@Service
public class ProductServiceImpl implements ProductService {

    private final ProductMapper productMapper;

    @Override
    public Product getProduct(Long id) {
        return productMapper.findById(id);
    }

    @Override
    public List<Product> getProductList() {
        List<Product> productList = productMapper.findAll();
        log.info("productList : {}",productList);
        return productList;
    }
}
