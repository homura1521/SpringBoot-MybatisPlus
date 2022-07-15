package com.huarui.mybatisconfig;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.po.TableFill;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

import java.util.ArrayList;

public class MybatisConfig {
    public static void main(String[] args) {
// 需要构建一个 代码自动生成器 对象
        AutoGenerator mpg = new AutoGenerator();
// 配置策略

// 1、全局配置
        GlobalConfig gc = new GlobalConfig();
        String projectPath = System.getProperty("user.dir");//获取用户程序当前路径（项目根的路径）
        gc.setOutputDir(projectPath+"/src/main/java");//生成文件的输出目录
        gc.setAuthor("奉劲秋");//开发人员
        gc.setOpen(false);//是否打开输出目录
        gc.setFileOverride(false); // 是否覆盖已有文件(默认值：false)
        gc.setServiceName("%sService"); // 去Service的I前缀
        gc.setIdType(IdType.ID_WORKER);//主键策略(查看是否为string或long)
        gc.setDateType(DateType.ONLY_DATE);//定义生成的实体类中日期类型
        gc.setSwagger2(true);//是否生成swagger2文档
        mpg.setGlobalConfig(gc);//把全局配置添加到代码生成器主类



//2、设置数据源
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setUrl("jdbc:mysql://localhost:3306/mjava9?useSSL=false&useUnicode=true&characterEncoding=utf-8&serverTimezone=GMT%2B8");
        dsc.setDriverName("com.mysql.cj.jdbc.Driver");//低版本mysql是com.mysql.jdbc.Driver
        dsc.setUsername("root");
        dsc.setPassword("root");
        dsc.setDbType(DbType.MYSQL);
        mpg.setDataSource(dsc);//把数据源配置添加到代码生成器主类



//3、包的配置
        PackageConfig pc = new PackageConfig();
        // pc.setModuleName("blog");
        pc.setParent("com.huarui");//模块名
        pc.setEntity("entity");
        pc.setMapper("mapper");
        pc.setService("service");
        pc.setController("controller");
        mpg.setPackageInfo(pc);



//4、策略配置
        StrategyConfig strategy = new StrategyConfig();
        strategy.setInclude("student"); // 设置要映射的表名
        strategy.setNaming(NamingStrategy.underline_to_camel);//数据库表映射到实体的命名策略
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);//数据库表字段映射到实体的命名策略
        strategy.setEntityLombokModel(true); // 自动lombok；
        strategy.setLogicDeleteFieldName("deleted");//开启逻辑删除


// 自动填充配置
        TableFill gmtCreate = new TableFill("gmt_create", FieldFill.INSERT);//自动增加时间
        TableFill gmtModified = new TableFill("gmt_modified",//自动修改时间
                FieldFill.INSERT_UPDATE);
        ArrayList<TableFill> tableFills = new ArrayList<>();
        tableFills.add(gmtCreate);
        tableFills.add(gmtModified);
        strategy.setTableFillList(tableFills);


// 乐观锁
        //乐观锁的实现方式
        //乐观锁一般有两种实现方式：采用版本号机制 和 CAS（Compare-and-Swap，即比较并替换）算法实现。
        //
        //版本号机制
        //版本号机制是在数据表中加上一个 version 字段来实现的，表示数据被修改的次数，当执行写操作并且写入成功后，version = version + 1，当线程A要更新数据时，在读取数据的同时也会读取 version 值，在提交更新时，若刚才读取到的 version 值为当前数据库中的version值相等时才更新，否则重试更新操作，直到更新成功。
        strategy.setVersionFieldName("version");


        strategy.setRestControllerStyle(true);//restful api风格控制器
        strategy.setControllerMappingHyphenStyle(true); //url中驼峰转连字符
        mpg.setStrategy(strategy);//把设置好的策略添加到主类


        mpg.execute(); //执行

    }
}
