package com.code.lab1bai3;

import java.util.Scanner;

public class ShapeTest {
    public static void main(String[] args) {
        Shape[] hinh = new Shape[5];
        Scanner sc = new Scanner(System.in);
        Shape sh = null;
        int num;
        System.out.println("Nhập danh sách các hình");
        for (int i = 0; i < hinh.length; i++) {
            System.out.println("1. Hình tròn | 2. Hình tam giác | 3. Xuất Mảng");
            System.out.print("Chọn chức năng ở đây: ");
            num = sc.nextInt();
            if (num == 1) {
                System.out.println("=> Bạn chọn nhập hình tròn");
                Circle ht = new Circle();
                ht.input();
                hinh[i] = ht;
            } else if (num == 2) {
                System.out.println("=> Bạn chọn nhập hình tam giác");

                Triangle tg = new Triangle();
                tg.input();
                hinh[i] = tg;

            } else {
                System.out.println("----DANH SÁCH MẢNG HÌNH----");
                System.out.println("");
                for (Shape x : hinh) {
                    x.printInfo();
                }
            }

        }

    }
}
