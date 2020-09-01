package com.along.test_user.controller;

import com.along.test_user.entity.Msg;
import com.along.test_user.entity.user;
import com.along.test_user.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class UserController {

    @Resource
    UserService userService;

    @GetMapping("/query")
    public Msg findAll(){
        return Msg.success(userService.findAllUser());
    }

    @GetMapping("insert")
    public String insert(user user){
        int result=userService.insertUser(user);
        if(result>=1){
            return "添加成功";
        }else{
            return "添加失败";
        }
    }

    @GetMapping("update")
    public String update(user user){
        int result=userService.updateUser(user);
        if(result>=1){
            return "修改成功";
        }else{
            return "修改失败";
        }
    }

    @GetMapping("delete")
    public String delete(int id){
        int result=userService.deleteUser(id);
        if(result>=1){
            return "删除成功";
        }else{
            return "删除失败";
        }
    }

    @GetMapping("/select")
    public Msg findBookByName(int id){
        return Msg.success(userService.findById(id));
    }
}
