package com.example.hello.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ThreeController {
    @GetMapping("/add")
    public String add(){
        return "添加学生信息成功！";
    }

    @GetMapping("/del")
    public String dele(){
        return "删除学生信息成功！";
    }

    @GetMapping("/update")
    public String update(){
        return "修改学生信息成功！";
    }




}
