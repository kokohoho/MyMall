package com.nizhengjun.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.nizhengjun.common.utils.PageUtils;
import com.nizhengjun.product.entity.ProductAttrValueEntity;

import java.util.Map;

/**
 * spu属性值
 *
 * @author zhengjun.ni
 * @email 694935259@qq.com
 * @date 2021-04-11 09:50:16
 */
public interface ProductAttrValueService extends IService<ProductAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

