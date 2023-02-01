package com.feizhou.swagger.test;

import com.jfinal.core.JFinal;

/**
 * [description]
 *
 * @author lee
 * @version V1.0.0
 * @date 2017/7/7
 */
public class App {
    public static void main(String[] args) {
        JFinal.start("src/main/webapp", 8080, "/");
    }
}
