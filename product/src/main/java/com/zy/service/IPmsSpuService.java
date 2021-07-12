package com.zy.service;

import com.zy.pojo.PmsSpu;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * spu属性表 服务类
 * </p>
 *
 * @author zy
 * @since 2021-07-07
 */
public interface IPmsSpuService extends IService<PmsSpu> {
    List<PmsSpu> list(Long categoryId);
    List<PmsSpu> getByCategory(Long[] categoryIds);
}
