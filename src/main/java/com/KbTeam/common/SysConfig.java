package com.KbTeam.common;

import com.KbTeam.controller.kbAdmin.login.LoginCon;
import com.jfinal.config.*;
import com.jfinal.core.JFinal;
import com.jfinal.kit.PropKit;
import com.jfinal.template.Engine;

/**
 * About:
 * Other:
 * Created: Xiaolong WU on 2018/2/6 下午4:21.
 * Editored:
 */
public class SysConfig extends JFinalConfig {

    public static void main(String[] args) {
        JFinal.start("src/main/webapp", 8800, "/");
    }

    /**
     * 配置常量
     * @param me
     */
    public void configConstant(Constants me) {
        // 加载少量必要配置，随后可用PropKit.get(...)获取值
        PropKit.use("config.properties");
        me.setDevMode(PropKit.getBoolean("devMode", false));
    }

    /**
     * 配置路由
     * @param me
     */
    public void configRoute(Routes me) {
        me.add(new AppRoutes());//应用路由   /bug/app/**
        me.add(new KbAdminRoutes());//后端路由  /bug/kbAdmin/**
    }

    /**
     * 配置页面模板
     * @param me
     */
    public void configEngine(Engine me) {
    }

    /**
     * 配置插件
     * @param me
     */
    public void configPlugin(Plugins me) {
//        // 配置 druid 数据库连接池插件
//        DruidPlugin druidPlugin = new DruidPlugin(PropKit.get("jdbcUrl"), PropKit.get("user"), PropKit.get("password").trim());
//        me.add(druidPlugin);
//
//        // 配置ActiveRecord插件
//        ActiveRecordPlugin arp = new ActiveRecordPlugin(druidPlugin);
//        // 所有映射在 MappingKit 中自动化搞定
//        MappingKit.mapping(arp);
//        me.add(arp);
    }

//    public static DruidPlugin createDruidPlugin() {
//        return new DruidPlugin(PropKit.get("jdbcUrl"), PropKit.get("user"), PropKit.get("password").trim());
//    }

    /**
     * 配置全局拦截器
     * @param me
     */
    public void configInterceptor(Interceptors me) {

    }

    /**
     * 配置处理器
     */
    public void configHandler(Handlers me) {
    }


    /**
     * 项目启动前调用
     */
    @Override
    public void afterJFinalStart() {
        super.afterJFinalStart();
    }

    /**
     * 项目启动后调用
     */
    @Override
    public void beforeJFinalStop() {
        super.beforeJFinalStop();
    }
}
