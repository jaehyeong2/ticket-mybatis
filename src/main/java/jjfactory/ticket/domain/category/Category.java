package jjfactory.ticket.domain.category;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class Category {
    private Long category_id;
    private String name;

    private LocalDateTime createDate;
    private LocalDateTime updatedDate;
}
