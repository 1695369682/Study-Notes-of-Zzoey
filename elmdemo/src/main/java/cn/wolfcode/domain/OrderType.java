package cn.wolfcode.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//食物分类表
@Getter
@Setter
@ToString
public class orderType {
    private long orderTypeId;       //分类编号
    private String orderTypeName;   //分类名称
    private String orderTypeImg;    //分类图片
}
