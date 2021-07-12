package com.zy.service;

import com.zy.pojo.PmsCategory;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 分类表 服务类
 * </p>
 *
 * @author zy
 * @since 2021-07-06
 */
public interface IPmsCategoryService extends IService<PmsCategory> {
    List<PmsCategory> getByParentId(Long parentId);
    List<PmsCategory> getAll(Long parentId);
}
