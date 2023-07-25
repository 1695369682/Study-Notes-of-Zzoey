package cn.wolfcode.mapper;

import cn.wolfcode.domain.food;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface foodMapper {
    List<food> addFood();
}
