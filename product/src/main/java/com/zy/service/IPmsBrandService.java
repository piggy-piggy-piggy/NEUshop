package com.zy.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.zy.pojo.PmsBrand;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 品牌表 服务类
 * </p>
 *
 * @author zy
 * @since 2021-07-01
 */
public interface IPmsBrandService extends IService<PmsBrand> {
    IPage<PmsBrand> page(Integer pageNo,Integer pageSize,String name);
    List<PmsBrand> getAll();
}
