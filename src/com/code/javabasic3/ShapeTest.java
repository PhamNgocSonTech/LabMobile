package com.code.javabasic3;

import java.util.Scanner;

public class ShapeTest {
    public static void main(String[] args) {
        Shape[] hinh = new Shape[5];
        Scanner sc = new Scanner(System.in);
        Triangle tg1 = new Triangle("tam giac abc", 4, 8, 10);
        Triangle tg2 = new Triangle("tam giac bcd", 2, 3, 8);
        Triangle tg3 = new Triangle("tam giac mnq", 1, 6, 4);
        Circle ht1 = new Circle("hình tròn O", 2);
        Circle ht2 = new Circle("hình tròn C", 4);
        hinh[0] = tg1;
        hinh[1] = tg2;
        hinh[2] = tg3;
        hinh[3] = ht1;
        hinh[4] = ht2;
        System.out.println("Danh sach mang hinh la");
        for (Shape x : hinh) {
            x.printInfo();
        }
        // System.out.println("1. Hinh tron/2. Hinh tam giac");
        // int num = sc.nextInt();
        // for (int i = 0; i < hinh.length; i++) {
        // if(num == 1){
        // String name;
        // double bk;
        // System.out.println("Nhập tên hình tròn: ");
        // name = sc.nextLine();
        // sc.nextLine();
        // System.out.println("Nhập bán kính: ");
        // bk = sc.nextDouble();
        // Circle tron = new Circle(name, bk);
        // hinh[i] = tron;
        // }else{
        // String name_temp;
        // double s1,s2,s3;

        // System.out.println("Nhập tên hình tam giác: ");
        // name_temp = sc.nextLine();
        // System.out.println("Nhập cạnh a ");
        // s1 = sc.nextDouble();
        // System.out.println("Nhập cạnh b ");
        // s2 = sc.nextDouble();
        // System.out.println("Nhập cạnh c ");
        // s3 = sc.nextDouble();
        // Triangle tgiac = new Triangle(name_temp, s1, s2, s3);
        // hinh[i] = tgiac;

        // }
        // // System.out.printf("a[%d]",i);
        // }

        

    }
}
