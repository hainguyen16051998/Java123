package Bai3;

public class Rectangle {
    public static void main(String[] args) {
        RectangleMain rectangle = new RectangleMain();
        rectangle.nhapthongtin();
        System.out.println("---------------------");
        System.out.println(rectangle);
        System.out.println("Chu vi hình chữ nhật là: " + RectangleMain.findPerimeter());
        System.out.println("Diện tích hình chữ nhật là: " + RectangleMain.findArea());
    }


}
