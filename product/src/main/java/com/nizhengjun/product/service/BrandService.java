package com.nizhengjun.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.nizhengjun.common.utils.PageUtils;
import com.nizhengjun.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author zhengjun.ni
 * @email 694935259@qq.com
 * @date 2021-04-11 09:50:16
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

