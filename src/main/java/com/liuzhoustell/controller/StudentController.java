package com.liuzhoustell.controller;


import com.liuzhousteel.swallow.extension.controller.BaseController;
import lombok.RequiredArgsConstructor;
import io.swagger.annotations.Api;
import com.liuzhoustell.entity.Student;
import com.liuzhoustell.service.StudentService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author Harvey
 * create on 2019-09-05 15:23:36
 */
@RestController
@Api(value = "/student", description = "$tableInfo.comment接口")
@RequestMapping("/student")
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
public class StudentController extends BaseController<StudentService, Student>{
    
}