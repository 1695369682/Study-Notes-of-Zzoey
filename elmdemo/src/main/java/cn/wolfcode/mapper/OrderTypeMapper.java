package cn.wolfcode.mapper;

import cn.wolfcode.domain.orderType;
import org.springframework.stereotype.Repository;

import java.util.List;

//mapper接口
@Repository
public interface orderTypeMapper {
//    查询所有食品分类数据
    List<orderType> listAll();
    void insert();
    void del();
    int update();
}
