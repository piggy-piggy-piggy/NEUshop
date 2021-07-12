package com.zy.service.impl;

import com.zy.pojo.PmsStock;
import com.zy.mapper.PmsStockMapper;
import com.zy.service.IPmsStockService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * sku库存表 服务实现类
 * </p>
 *
 * @author zy
 * @since 2021-07-09
 */
@Service
public class PmsStockServiceImpl extends ServiceImpl<PmsStockMapper, PmsStock> implements IPmsStockService {

}
