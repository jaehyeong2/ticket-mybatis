package jjfactory.ticket.controller.product;

import jjfactory.ticket.service.product.ProductServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RequiredArgsConstructor
@Controller
public class ProductController {

    private final ProductServiceImpl productService;

    @GetMapping("product")
    public String getProducts(Model model){
        model.addAttribute("products",productService.getProductList());
        return "product/products";
    }

    @GetMapping("product/{id}")
    public String getProductDetail(@PathVariable Long id){
        return "product/productDetail";
    }
}
