package jjfactory.ticket.domain.category;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
public class Category {
    private Long category_id;
    private String name;

    private LocalDateTime createDate;
    private LocalDateTime updatedDate;
}
