package com.zy.controller;


import com.zy.pojo.UmsRole;
import com.zy.service.IUmsRoleService;
import com.zy.util.ResultJson;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 * 角色表 前端控制器
 * </p>
 *
 * @author zy
 * @since 2021-07-02
 */
@RestController
@RequestMapping("/ums-role")
public class UmsRoleController {
    @Resource
    IUmsRoleService roleService;
    @GetMapping("/list")
    ResultJson list(String name){
        return  ResultJson.success(roleService.list(name));
    }
    @PostMapping("/add")
    ResultJson add(UmsRole umsRole){
        return  ResultJson.success(roleService.save(umsRole),"添加角色成功");
    }
    @GetMapping("/getone")
    ResultJson getone(Long id){
        return ResultJson.success(roleService.getById(id));
    }
    @PostMapping("/update")
    ResultJson update(UmsRole umsRole){
        return ResultJson.success(roleService.updateById(umsRole),"修改角色成功");
    }
    @PostMapping("/del")
    ResultJson del(UmsRole umsRole){
        String message= umsRole.getActive()==0? "删除角色成功" : "恢复角色成功";
        return ResultJson.success(roleService.updateById(umsRole),message);
    }
}
