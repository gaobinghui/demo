package com.pinyougou.manage.controller;/*
    Date:2018/8/27
    Author:B.H.Gao,the one whom in itcast
*/

import com.alibaba.dubbo.config.annotation.Reference;
import com.pinyougou.pojo.TbBrand;
import com.pinyougou.sellergoods.service.BrandService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/brand")
@RestController
public class BrandController {

    @Reference
    private BrandService brandService;

    //获取并输出所有品牌列表
    @GetMapping("/findAll")
    public List<TbBrand> findAll(){
        return brandService.queryAll();
    }

}
