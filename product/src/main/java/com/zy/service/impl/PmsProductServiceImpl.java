package com.zy.service.impl;

import com.zy.pojo.PmsProduct;
import com.zy.mapper.PmsProductMapper;
import com.zy.service.IPmsProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品表 服务实现类
 * </p>
 *
 * @author zy
 * @since 2021-07-07
 */
@Service
public class PmsProductServiceImpl extends ServiceImpl<PmsProductMapper, PmsProduct> implements IPmsProductService {

}
