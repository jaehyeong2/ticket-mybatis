package jjfactory.ticket.service.category;


import jjfactory.ticket.mapper.CategoryMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Transactional
@Service
public class CategoryServiceImpl implements CategoryService{
    private final CategoryMapper categoryMapper;
}
