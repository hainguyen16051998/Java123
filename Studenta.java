//package Bai2;
//
//import java.util.Scanner;
//
//public class Studenta {
//    public static void main(String[] args) {
//        System.out.println("Nhập số lượng sinh viên cần thêm thông tin: ");
//        int studentNumber = new Scanner(System.in).nextInt();
//        Student[] students = new Student[studentNumber];
//        for (int i = 0; i < studentNumber; i++) {
//            students[i] = new Student();
//            students[i].nhapthongtin();
//        }
//
//        System.out.println("---------------------");
//        indanhsachthongtinsinhvien(students);
//    }
//
//
//    public static void indanhsachthongtinsinhvien(Student[] students) {
//        for (int i = 0; i < students.length; i++) {
//            System.out.println(students[i]);
//        }
//    }
//
//}
