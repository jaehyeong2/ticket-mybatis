package jjfactory.ticket.dto;

import lombok.Data;

@Data
public class CommonRes<T> {
    private T data;
}
