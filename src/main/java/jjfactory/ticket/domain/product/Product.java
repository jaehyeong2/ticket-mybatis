package jjfactory.ticket.domain.product;

import jjfactory.ticket.domain.product.enums.Category;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
public class Product {
    private Long id;
    private String name;
    private int price;
    private int deliveryPrice;
    private int totalPrice;

    private Category category;

    private LocalDateTime createDate;
    private LocalDateTime updatedDate;

    public Product() {
    }
}
