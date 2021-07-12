package com.zy.service;

import com.zy.pojo.UmsRoleUser;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 角色与用户关联表 服务类
 * </p>
 *
 * @author zy
 * @since 2021-07-02
 */
public interface IUmsRoleUserService extends IService<UmsRoleUser> {
 boolean save( Long roleId,Long[] userIds);
 List<UmsRoleUser> getUsersByRoleId(Long roleId);
}
