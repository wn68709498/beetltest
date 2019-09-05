package com.liuzhoustell.service;

import com.liuzhoustell.entity.User;
import com.liuzhoustell.dao.UserDao;
import com.liuzhousteel.swallow.extension.service.BaseService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * (User)表服务
 *
 * @author Harvey
 * create on 2019-09-04 14:53:08
 */
@Service
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
public class UserService extends BaseService<UserDao, User>{

	public List<User> selectAll(User user){
		return dao.select(user.getAge(),user.getName(),user.getId());
	}

}
