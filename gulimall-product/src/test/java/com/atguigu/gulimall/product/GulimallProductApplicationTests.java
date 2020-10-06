package com.atguigu.gulimall.product;

import com.atguigu.gulimall.product.entity.BrandEntity;
import com.atguigu.gulimall.product.service.BrandService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.conditions.query.QueryChainWrapper;
import org.checkerframework.checker.units.qual.A;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class GulimallProductApplicationTests {

	@Resource
	private BrandService brandService;

	@Test
	void contextLoads() {
		List<BrandEntity> list=brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id",1 ));
		for (BrandEntity brandEntity:list)
			System.out.println(brandEntity);
	}



}
