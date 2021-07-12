package com.zy.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zy.pojo.PmsSpu;
import com.zy.mapper.PmsSpuMapper;
import com.zy.service.IPmsSpuService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * <p>
 * spu属性表 服务实现类
 * </p>
 *
 * @author zy
 * @since 2021-07-07
 */
@Service
public class PmsSpuServiceImpl extends ServiceImpl<PmsSpuMapper, PmsSpu> implements IPmsSpuService {
    @Override
    public List<PmsSpu> list(Long categoryId) {
        QueryWrapper<PmsSpu> wrapper = new QueryWrapper<>();
        wrapper.eq("category_id",categoryId);
        return this.list(wrapper);
    }

    @Override
    public List<PmsSpu> getByCategory(Long[] categoryIds) {
        List<Long> ids = Arrays.asList(categoryIds);
        QueryWrapper<PmsSpu> wrapper = new QueryWrapper<>();
        wrapper.in("category_id",ids);
        return this.list(wrapper);
    }
}
