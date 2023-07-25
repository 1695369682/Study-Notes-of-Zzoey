package cn.wolfcode.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
public class food {
    private long foodId;
    private String foodName;
    private String foodExplain;
    private String foodImg;
    private double foodPrice;
    private long businessId;
    private String remarks;
}
