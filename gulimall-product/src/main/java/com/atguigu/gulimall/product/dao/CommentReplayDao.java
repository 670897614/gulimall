package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 * 
 * @author LJERII
 * @email JinLin_LL@163.com
 * @date 2020-10-05 20:07:16
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {
	
}
