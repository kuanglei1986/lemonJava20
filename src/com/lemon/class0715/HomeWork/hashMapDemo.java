package com.lemon.class0715.HomeWork;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * @time: 2020/7/16 10:32
 * @author: Mr.Right
 * @contact: 348533713@qq.com
 * @file: hashMapDemo
 * @desc: ┏┓　　　┏┓+ +
 * 　　　┏┛┻━━━┛┻┓ + +
 * 　　　┃　　　　　　　┃
 * 　　　┃　　　━　　　┃ ++ + + +
 * 　　 ████━████ ┃+
 * 　　　┃　　　　　　　┃ +
 * 　　　┃　　　┻　　　┃
 * 　　　┃　　　　　　　┃ + +
 * 　　　┗━┓　　　┏━┛
 * 　　　　　┃　　　┃
 * 　　　　　┃　　　┃ + + + +
 * 　　　　　┃　　　┃　　　　Codes are far away from bugs with the animal protecting
 * 　　　　　┃　　　┃ + 　　　　神兽保佑,代码无bug
 * 　　　　　┃　　　┃
 * 　　　　　┃　　　┃　　+
 * 　　　　　┃　 　　┗━━━┓ + +
 * 　　　　　┃ 　　　　　　　┣┓
 * 　　　　　┃ 　　　　　　　┏┛
 * 　　　　　┗┓┓┏━┳┓┏┛ + + + +
 * 　　　　　　┃┫┫　┃┫┫
 * 　　　　　　┗┻┛　┗┻┛+ + + +
 */
/*
两个班级，1801，studentA，studentB，studentC，
        1802，studentD，studentE
用map保存两个班的学生数据
用两种循环遍历，取出每个班级下的学生shuju
 */
public class hashMapDemo {
    public static void main(String[] args) {
        HashMap<String,HashMap<String,String>> studentA = new HashMap<>();
        HashMap<String,HashMap<String,String>> studentB = new HashMap<>();
        HashMap<String,HashMap<String,String>> studentC = new HashMap<>();
        HashMap<String,HashMap<String,String>> studentD = new HashMap<>();
        HashMap<String,HashMap<String,String>> studentE = new HashMap<>();
        studentA.put("studentA",newPut("zhangsan","25","男"));
        studentB.put("studentB",newPut("lisi","26","男"));
        studentC.put("studentC",newPut("xiaohua","27","女"));
        studentD.put("studentD",newPut("xiaoming","28","男"));
        studentE.put("studentE",newPut("xiaohong","29","女"));

        HashMap<String,HashMap> class1801=new HashMap<>();
        HashMap<String,HashMap> class1908=new HashMap<>();



    }

    public static HashMap<String,String> newPut(String name, String age, String gender){
        HashMap<String,String> s = new HashMap<>();
        s.put("name",name);
        s.put("age",age);
        s.put("gender",gender);
        return s;
    }

    public static void show(HashMap<String,String> s){
        System.out.println(s.get("name"));
        System.out.println(s.get("gender"));
        System.out.println(s.get("age"));
        System.out.println("--------");
    }


}

