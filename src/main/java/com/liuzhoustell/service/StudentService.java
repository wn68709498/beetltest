package com.liuzhoustell.service;

import com.liuzhoustell.entity.Student;
import com.liuzhoustell.dao.StudentDao;
import com.liuzhousteel.swallow.extension.service.BaseService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * (Student)表服务
 *
 * @author Harvey
 * create on 2019-09-05 15:23:36
 */
@Service
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
public class StudentService extends BaseService<StudentDao, Student>{
    
}