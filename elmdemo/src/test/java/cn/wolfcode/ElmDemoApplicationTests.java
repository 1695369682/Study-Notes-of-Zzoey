package cn.wolfcode;

import cn.wolfcode.domain.food;
import cn.wolfcode.domain.orderType;
import cn.wolfcode.mapper.foodMapper;
import cn.wolfcode.mapper.orderTypeMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class ElmDemoApplicationTests {
//在spring容器中取出
	@Autowired
	private orderTypeMapper orderTypeMapper;
	@Autowired
	private foodMapper foodMapper;

	@Test
	void contextLoads() {
		List<orderType> list=orderTypeMapper.listAll();
		for (orderType o:list){
			System.out.println(o);
		}

		List<food> list2= foodMapper.addFood();
		for (food x:list2){
			System.out.println(x);
		}
	}

}
