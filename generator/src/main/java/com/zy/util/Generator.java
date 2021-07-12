package com.zy.util;


import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import com.zy.pojo.BasePojo;

import java.util.HashMap;
import java.util.Map;

public class Generator {
    public static void main(String[] args) {
        AutoGenerator mpg=new AutoGenerator();
       GlobalConfig gc=new GlobalConfig();
        gc.setAuthor("zy");
        //定义项目路径
        final String path=System.getProperty("user.dir");
        mpg.setGlobalConfig(gc);
        //定义pojo路径
        String pojopath = path +"/pojo";
        String otherpath =path +"/product";
        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setUrl("jdbc:mysql://localhost:3306/shop?useUnicode=true&useSSL=false&characterEncoding=utf8");
        // dsc.setSchemaName("public");
        dsc.setDriverName("com.mysql.jdbc.Driver");
        dsc.setUsername("root");
        dsc.setPassword("20131220");
        mpg.setDataSource(dsc);
        // 包配置
        final PackageConfig pc = new PackageConfig();
        pc.setParent("com.zy");
        pc.setEntity("pojo");
        pc.setMapper("mapper");
        pc.setService("service");
        pc.setServiceImpl("service.impl");
        pc.setController("controller");
        Map<String,String> pathInfo=new HashMap<>();
        pathInfo.put("xml_path",otherpath+"/src/main/resources/com/zy/mapper");
        pathInfo.put("entity_path",pojopath+"/src/main/java/com/zy/pojo");
        pathInfo.put("mapper_path",otherpath+"/src/main/java/com/zy/mapper");
        pathInfo.put("service_path",otherpath+"/src/main/java/com/zy/service");
        pathInfo.put("service_impl_path",otherpath+"/src/main/java/com/zy/service/impl");
        pathInfo.put("controller_path",otherpath+"/src/main/java/com/zy/controller");
        pc.setPathInfo(pathInfo);
        mpg.setPackageInfo(pc);
        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
        strategy.setNaming(NamingStrategy.underline_to_camel);
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
        strategy.setSuperEntityClass(BasePojo.class);
        strategy.setEntityLombokModel(true);
        strategy.setRestControllerStyle(true);
        // 公共父类
        // 写于父类中的公共字段
        strategy.setSuperEntityColumns("id");
        strategy.setInclude("pms_stock");
        strategy.setControllerMappingHyphenStyle(true);
        strategy.setTablePrefix(pc.getModuleName() + "_");
        mpg.setStrategy(strategy);
        mpg.setTemplateEngine(new FreemarkerTemplateEngine());
        mpg.execute();
    }
}
