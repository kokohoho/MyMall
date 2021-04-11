package com.nizhengjun.order.dao;

import com.nizhengjun.order.entity.PaymentInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 支付信息表
 * 
 * @author zhengjun.ni
 * @email 694935259@qq.com
 * @date 2021-04-11 12:29:43
 */
@Mapper
public interface PaymentInfoDao extends BaseMapper<PaymentInfoEntity> {
	
}
