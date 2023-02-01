package com.feizhou.swagger.test;

import com.feizhou.swagger.config.routes.SwaggerRoutes;
import com.feizhou.swagger.test.routes.TestRoutes;
import com.jfinal.config.*;
import com.jfinal.ext.handler.ContextPathHandler;
import com.jfinal.template.Engine;

/**
 * [description]
 *
 * @author lee
 * @version V1.0.0
 * @date 2017/7/3
 */
public class AppConfig extends JFinalConfig {

    public void configConstant(Constants constants) {
        // 输出本次请求的 URL、Controller、Method 以及请求所携带的参数
        constants.setDevMode(true);
    }

    public void configRoute(Routes routes) {
        routes.add(new SwaggerRoutes());
        routes.add(new TestRoutes());
    }

    public void configEngine(Engine engine) {

    }

    public void configPlugin(Plugins plugins) {
    }

    public void configInterceptor(Interceptors interceptors) {
    }

    public void configHandler(Handlers handlers) {
        handlers.add(new ContextPathHandler("basePath"));
    }
}
