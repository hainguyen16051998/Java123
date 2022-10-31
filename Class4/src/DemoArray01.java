public class DemoArray01 {
    public static void main(String[] args) {
        int a1 = 1;
        int a2 = 2;
        int a3 = 3;

        int[] arr = new int[3]; //mảng có 3 phần tử
        int[] arr1; // khai báo
        arr1 = new int[3]; //khởi tạo(gán giá trị)


        int[] arr2 = {2, 4, 6}; // mảng có 3 phần tử
        System.out.println(arr2[0]); //truy xuất tới giá trị đầu tiên trong mảng arr2
        System.out.println(arr2[1]);
        arr2[0] = 100; //thay đổi giá trị của mảng
        System.out.println(arr2[0]);
        System.out.println("độ dài của mảng là : " + arr2.length);

        // duyệt mảng --> vòn lặp
        System.out.print("[");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println( arr2[i]);
            break;
        }

    }
}
