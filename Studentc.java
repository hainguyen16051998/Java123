//package Bai2;
//
//import java.util.Scanner;
//
//public class Studentc {
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
//    }
//
//    public static void inSV_lop(Student[] sv) {
//        System.out.println("======================================================");
//        System.out.print("Danh sách lớp: ");
//        String s = new Scanner(System.in).nextLine();
//        System.out.printf( "Id", "Name", "Class", "Course");
//        for (Student student : sv) {
//            if (student.getLop().equalsIgnoreCase(s)) {
//                student.in();
//            }
//            System.out.println();
//        }
//    }
//}
