package com.feizhou.swagger.test.controller;

import com.feizhou.swagger.annotation.Api;
import com.feizhou.swagger.annotation.ApiOperation;
import com.feizhou.swagger.annotation.Param;
import com.feizhou.swagger.annotation.Params;
import com.jfinal.core.Controller;

import java.util.Arrays;
import java.util.List;

/**
 * [description]
 *
 * @author lee
 * @version V1.0.0
 * @date 2017/7/8
 */
@Api(tag = "index", description = "测试输出")
public class IndexController extends Controller {

    public void index() {
        setAttr("aaa", "aaaaaa");
        this.render("index.html");
    }

    @ApiOperation(url = "/test", tag = "index", httpMethod = "get", description = "测试json")
    @Params({
            @Param(name = "id", description = "编号", required = true, dataType = "Long"),
            @Param(name = "name", description = "姓名", required = true, dataType = "String")
    })
    public void test() {
    	String  id = getPara("id").toString();
    	String name = getPara("name");
        List<String> list = Arrays.asList(id,name);
        this.renderJson(list);
    }
    @ApiOperation(url="/operator",tag="operator",httpMethod="get",description="测试")
    @Params({
        @Param(name = "name", description = "请输入姓名信息", required = true, dataType = "String"),
        @Param(name = "password", description = "请输入密码", required = true, dataType = "String")
    })
    public void operator(){
    	String name = getPara("name");
    	String password = getPara("password");
    	renderJson(name+password);
    }
    
    
}
