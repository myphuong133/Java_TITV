import java.util.Arrays;

public class java56_xu_ly_mang {
    public static void main(String[] args) {
        // split(element) : Cắt chuỗi thành mảng
        String splitEx = "1 2 3 4 5";
        String splitEx2 = "1 2, 3 4. 5";
        String[] arrSplit_1 = splitEx.split(" ");
        System.out.println("Cắt space trong 1 2 3 4: ");
        System.out.println(Arrays.toString(arrSplit_1));
        System.out.println("Cắt dựa trên 2 điều kiện");
        String[] arrSplit_2 = splitEx2.split("\\.|\\,");
        System.out.println(Arrays.toString(arrSplit_2));

    }


}
