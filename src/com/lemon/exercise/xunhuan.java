package com.lemon.exercise;

import java.util.Arrays;

/**
 * @time: 2020/6/21 16:25
 * @author: Mr.Right
 * @contact: 348533713@qq.com
 * @file: xunhuan.class
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


public class xunhuan {
    public static void main(String[] args) {

        System.out.println("-----直角三角形-----");

        for (int i=1; i<=5;i++){        //i 行数
            for (int j=1;j<=i;j++){     //j 每行星星数
                System.out.print("*");
            }
            System.out.print("\n");
        }

        System.out.println("-----等腰三角形-----");

        for (int i=1; i<=5;i++){
            for (int j=5-i;j>=1;j--){
                System.out.print(" ");
            }
            for (int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

        System.out.println("-----等边三角形-----");

        for (int i=1;i<=5;i++){
            for (int j=5-i;j>=1;j--){
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }

        System.out.println("-----冒泡排序-----");

        int[] array= {1,3,5,7,9,2,6,8,10,4};
        System.out.println("排序前："+Arrays.toString(array));
        for (int i=1;i<=array.length-1;i++){   //外循环控制次数
            for (int j=1;j<=array.length-i;j++){   //内循环控制起点
                if (array[j-1]<array[j]){
                    int t=array[j-1];
                    array[j-1]=array[j];
                    array[j]=t;
                }
            }
        }
        System.out.println("排序后："+Arrays.toString(array));


    }
}
