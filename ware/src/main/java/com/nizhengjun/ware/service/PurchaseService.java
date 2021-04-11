package com.nizhengjun.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.nizhengjun.common.utils.PageUtils;
import com.nizhengjun.ware.entity.PurchaseEntity;

import java.util.Map;

/**
 * 采购信息
 *
 * @author zhengjun.ni
 * @email 694935259@qq.com
 * @date 2021-04-11 12:32:31
 */
public interface PurchaseService extends IService<PurchaseEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

