package com.nizhengjun.coupon.dao;

import com.nizhengjun.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author zhengjun.ni
 * @email 694935259@qq.com
 * @date 2021-04-11 12:18:51
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
