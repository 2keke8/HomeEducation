package com.feizhou.swagger.test.routes;

import com.feizhou.swagger.test.controller.ImageController;
import com.feizhou.swagger.test.controller.IndexController;
import com.feizhou.swagger.test.controller.PhotoQrCode;
import com.jfinal.config.Routes;

/**
 * [description]
 *
 * @author lee
 * @version V1.0.0
 * @date 2017/7/8
 */
public class TestRoutes  extends Routes {

    @Override
    public void config() {
        setBaseViewPath("/WEB-INF/views");
        add("/", IndexController.class);
        add("/image", ImageController.class);
    }

}
