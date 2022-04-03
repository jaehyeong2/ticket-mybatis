package jjfactory.ticket.controller.product;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ProductController {

    @GetMapping("product/{id}")
    public String getProduct(@PathVariable Long id){
        return "productDetail";
    }
}
