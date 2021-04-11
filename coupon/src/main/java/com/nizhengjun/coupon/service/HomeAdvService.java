package com.nizhengjun.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.nizhengjun.common.utils.PageUtils;
import com.nizhengjun.coupon.entity.HomeAdvEntity;

import java.util.Map;

/**
 * 首页轮播广告
 *
 * @author zhengjun.ni
 * @email 694935259@qq.com
 * @date 2021-04-11 12:18:51
 */
public interface HomeAdvService extends IService<HomeAdvEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

