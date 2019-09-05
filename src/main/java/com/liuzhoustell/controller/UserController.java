package com.liuzhoustell.controller;


import com.liuzhousteel.swallow.core.util.ResultUtil;
import com.liuzhousteel.swallow.core.vo.ResultVO;
import com.liuzhousteel.swallow.extension.controller.BaseController;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import io.swagger.annotations.Api;
import com.liuzhoustell.entity.User;
import com.liuzhoustell.service.UserService;
import org.omg.PortableInterceptor.SUCCESSFUL;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * @author Harvey
 * create on 2019-09-04 14:53:08
 */
@RestController
@Api(value = "/user", description = "$tableInfo.comment接口")
@RequestMapping("/user")
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
public class UserController extends BaseController<UserService, User>{

	@GetMapping(value = "/select")
	public List<User> selectAll(User user){
		List result = service.selectAll(user);
		System.err.println(result);
		return result;
	}
}
