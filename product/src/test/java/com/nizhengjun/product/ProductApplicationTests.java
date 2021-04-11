package com.nizhengjun.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.nizhengjun.product.entity.BrandEntity;
import com.nizhengjun.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class ProductApplicationTests {


    @Autowired
    private BrandService brandService;

    @Test
    void contextLoads() {

//        BrandEntity entity = new BrandEntity();
//        entity.setName("小米");
//        brandService.save(entity);

//        BrandEntity entity2 = new BrandEntity();
//        entity2.setBrandId(2L);
//        entity2.setDescript("比华为性价比高");
//
//        brandService.updateById(entity2);

        List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 2L));
        list.forEach((item)->{
            System.out.println(item);
        });

        System.out.println("操作成功");
    }

}
