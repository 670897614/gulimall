package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author LJERII
 * @email JinLin_LL@163.com
 * @date 2020-10-06 14:37:20
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
