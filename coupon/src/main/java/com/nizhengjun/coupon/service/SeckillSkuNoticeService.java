package com.nizhengjun.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.nizhengjun.common.utils.PageUtils;
import com.nizhengjun.coupon.entity.SeckillSkuNoticeEntity;

import java.util.Map;

/**
 * 秒杀商品通知订阅
 *
 * @author zhengjun.ni
 * @email 694935259@qq.com
 * @date 2021-04-11 12:18:51
 */
public interface SeckillSkuNoticeService extends IService<SeckillSkuNoticeEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

