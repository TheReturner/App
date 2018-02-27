package com.app.web.controller.user;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.core.util.result.Response;
import com.app.web.controller.common.BaseController;

@RestController
@RequestMapping(value="/user")
public class UserController extends BaseController{
	
	@RequestMapping(value="/list")
	public Response listUser(){
		return success("200", "返回list成功", "list");
	}
	
	@RequestMapping("/info/{id}")  
    public Response getUserInfoByid(@PathVariable String id) {  
        return success("200", "返回"+id+"对应用户信息!", id);  
    }
	
	@RequestMapping("/add")
	public Response addUser(){
		return success("200", "添加用户成功!", null);
	}
	
	@RequestMapping("/delete/{id}")
	public Response deleteUser(@PathVariable String id){
		return success("200", "删除用户成功!", id);
	}
}
