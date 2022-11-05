package Bai3;


import java.util.Scanner;

public class RectangleMain {
    private static double height;
    private static double width;
    public String color;

    @Override
    public String toString() {
        return "RectangleMain{" +
                "width=" + width +
                ", height=" + height +
                ", color='" + color + '\'' +
                '}';
    }

    public void nhapthongtin() {
        System.out.print("Nhập chiều rộng: ");
        this.width = new Scanner(System.in).nextInt();

        System.out.print("Nhập chiều dài: ");
        this.height = new Scanner(System.in).nextInt();

        System.out.print("Nhập màu: ");
        this.color = new Scanner(System.in).nextLine();

    }

    public void Rectangle() {
        this.width = 1;
        this.height = 1;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public String getColor() {
        return color;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static double findArea(){
        return width*height;
    }

    public static double findPerimeter(){
        return 2*(width+height);
    }

}
