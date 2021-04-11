package com.nizhengjun.order.dao;

import com.nizhengjun.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author zhengjun.ni
 * @email 694935259@qq.com
 * @date 2021-04-11 12:29:43
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
