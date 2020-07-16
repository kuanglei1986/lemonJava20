package com.lemon.class0715.HomeWork;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;

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
        HashMap<String,String> studentA = new HashMap<>();
        HashMap<String,String> studentB = new HashMap<>();
        HashMap<String,String> studentC = new HashMap<>();
        HashMap<String,String> studentD = new HashMap<>();
        HashMap<String,String> studentE = new HashMap<>();
        studentA=newPut("zhangsan","25","男");
        studentB=newPut("lisi","26","男");
        studentC=newPut("xiaohua","27","女");
        studentD=newPut("xiaoming","28","男");
        studentE=newPut("xiaohong","29","女");

        HashSet<HashMap<String, String>> set1801= new HashSet<>();
        HashSet<HashMap<String, String>> set1802= new HashSet<>();
        set1801.add(studentA);
        set1801.add(studentB);
        set1801.add(studentC);
        set1802.add(studentD);
        set1802.add(studentE);

        HashMap<String,HashSet<HashMap<String, String>>> class1801 = new HashMap<>();
        HashMap<String,HashSet<HashMap<String, String>>> class1802 = new HashMap<>();
        class1801.put("class1801",set1801);
        class1802.put("class1802",set1802);


    }

    public static HashMap<String,String> newPut(String name,String age,String gender){
        HashMap<String,String> s = new HashMap<>();
        s.put("name",name);
        s.put("age",age);
        s.put("gender",gender);
        return s;
    }


}

