package com.nizhengjun.coupon.dao;

import com.nizhengjun.coupon.entity.SeckillSessionEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 秒杀活动场次
 * 
 * @author zhengjun.ni
 * @email 694935259@qq.com
 * @date 2021-04-11 12:18:51
 */
@Mapper
public interface SeckillSessionDao extends BaseMapper<SeckillSessionEntity> {
	
}
