package Bai2;

//package Bai2;
//
//
//import java.util.Scanner;
//
public class Studentb {
//    public static void main(String[] args) {
//        System.out.println("Nhập số lượng sinh viên cần thêm thông tin: ");
//        int studentNumber = new Scanner(System.in).nextInt();
//        Student[] students = new Student[studentNumber];
//        String temp;
//        for (int i = 0; i < studentNumber; i++) {
//            for (int j = i; j <studentNumber ; j++) {
//                if (students[i].compareTo(students[j])>0){
//                    temp = students[i];
//                    students[i] = students[j];
//                    students[j] = temp;
//                }
//            }
//            students[i] = new Student();
//            students[i].tensinhvien();
//        }
//
//        System.out.println("---------------------");
//        inradanhsachtheotensinhvien(students);
//    }
//
//
//    public static void inradanhsachtheotensinhvien(Student[] students) {
//        int count;
//        String temp;
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Nhập vào số chuỗi mà bạn muốn sắp xếp theo Alphabet  :");
//        count = scan.nextInt();
//        String[] students = new String[count];
//        Scanner scan2 = new Scanner(System.in);
//        System.out.println("Nhập giá trị cho từng chuỗi:");
//        for (int i = 0; i < count; i++) {
//            students[i] = scan2.nextLine();
//        }
//        scan.close();
//        scan2.close();
//        for (int i = 0; i < count; i++) {
//            for (int j = i + 1; j < count; j++) {
//                if (students[i].compareTo(students[j]) > 0) {
//                    temp = students[i];
//                    students[i] = students[j];
//                    students[j] = temp;
//                }
//            }
//        }
//        System.out.println("Các chuỗi sau khi sắp xếp là:");
//        for (int i = 0; i <= count - 1; i++) {
//            System.out.println(students[i]);
//        }
//    }
//}
//

    public static void sapxep(Studentb[] sv) {
        int n = sv.length;
        Studentb temp;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    continue;
                }

                if (soSanh(sv[i], sv[j])) {
                    temp = sv[j];
                    sv[j] = sv[i];
                    sv[i] = temp;
                }
            }

        }
    }

    public static boolean soSanh(Studentb sv1, Studentb sv2) {
        String[] a = sv1.getTen().split(" ");
        String[] b = sv2.getTen().split(" ");
        int n = Math.min(a.length, b.length);
        int i = 1;
        while (i <= n) {
            int temp = a[a.length - i].compareToIgnoreCase(b[b.length - i]);
            if (temp < 0) {
                return true;
            }
            if (temp > 0) {
                break;
            }
            i += 1;
        }
        return false;
    }



}