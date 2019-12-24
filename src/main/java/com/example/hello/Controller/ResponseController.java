package com.example.hello.Controller;


import com.example.hello.Bean.MyClass;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ResponseController {
    @GetMapping("/test1")
    public Map<String,String> fun(){
        Map<String,String> map = new HashMap<>();
        map.put("name","lisi");
        map.put("dese","very nice");
        return map;
    }
    @GetMapping("/test2")
    public MyClass test3(){

        MyClass myClass = new MyClass("wcy","1716270231",17);
        return myClass;
    }

    @GetMapping("/test3")
    public List<Map<String,String>> test2(){
        Map<String,String> map=new HashMap<>();
        Map<String,String> map1=new HashMap<>();

        List<Map<String,String>> list = new ArrayList<>();
        map.put("name","wcy");
        map1.put("name","lxy");
        list.add(map);
        list.add(map1);
        return list;
    }
    @GetMapping("/test4")
    public String test4(String name,String id,int age){
        System.out.println(name+id+age);
        return "6666";

    }





}
