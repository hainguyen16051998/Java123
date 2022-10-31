public class Demo {
    public static void main(String[] args) {
        double a=0;
        double b=9;
        String c = (a!=0) ? (-b/a) +"" : b != 0 ? "vonghiem" : "vosonghiem";
        System.out.printf(c);
    }
}