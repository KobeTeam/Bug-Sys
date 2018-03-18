package com.KbTeam.common;

import com.KbTeam.controller.kbAdmin.appConfig.AppConfigCon;
import com.KbTeam.controller.kbAdmin.gift.GiftCon;
import com.KbTeam.controller.kbAdmin.giftExch.GiftExchCon;
import com.KbTeam.controller.kbAdmin.index.IndexCon;
import com.KbTeam.controller.kbAdmin.login.LoginCon;
import com.KbTeam.controller.kbAdmin.user.UserCon;
import com.jfinal.config.Routes;

/**
 * About:后端路由
 * Other:
 * Created: Xiaolong WU on 2018/2/6 下午5:16.
 * Editored:
 */
public class KbAdminRoutes extends Routes {

    public void config() {
        String baseUrl = "/kbAdmin"; //基础url路径
        setBaseViewPath("/web");//设置基础web资源路径

        add(baseUrl+"/",LoginCon.class,"/login");
        add(baseUrl+"/index", IndexCon.class,"/index");
        add(baseUrl+"/user", UserCon.class,"/user");
        add(baseUrl+"/gift", GiftCon.class,"/gift");
        add(baseUrl+"/appConfig", AppConfigCon.class,"/appConfig");
        add(baseUrl+"/giftExch", GiftExchCon.class,"/giftExch");
    }
}
