import java.util.Arrays;
import java.util.Scanner;

/**
   Kí tự của java là 16bit chứ không phải là ASCII 8 bit
 *
 * */

public class java49_xu_ly_chuoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-------------------------" );
//        System.out.println("Nhập vào chuỗi đầu tiên" );
        String arr = "tung";

        // length()
        System.out.println("Độ dài chuỗi arr là: " + arr.length());
        System.out.println("-------------------------");

        // charAt(index)
        for (int i=0;i<arr.length();i++){
            System.out.println("Vị trí " + i + " của arr là: " + arr.charAt(i));
        }

        // getChart(vị trí bắt đầu, vị trí kết thúc, mảng lưu dữ liệu,
        // vị trí bắt đầu lưu của mảng)
        System.out.println("-------------------------" );
        char[] arrChar = new char[5];
        arr.getChars(1,3,arrChar,2);
        // getChar nó cắt từ 1 đến trước 3 VD: tung -> un
        System.out.println("getChars từ 1 đến 3 vị trí lưu là 2 của arr: " + Arrays.toString(arrChar));

        //getBytes => có 3 cách, lấy ra giá trị của ký tự
        // Hàm này in ra ký tự dưới dạng số trong bảng ASCII
        System.out.println("-------------------------" );
        System.out.println("Hàm getBytes in ra arr: ");
        byte[] arrBytes = arr.getBytes();
        for (int b: arrBytes
             ) {
            System.out.println(b);
        }

        //equals() => So sánh 2 chuỗi giống nhau, có phân biệt chữ hoa chữ thường
        //equalsIgnoreCase => Không phân biệt hoa thường
        System.out.println("-------------------------" );
        String arrEquals_1 = "tung";
        String arrEquals_2 = "Tung";
        String arrEquals_3 = "tung";
        System.out.println("tung equal Tung: " + arrEquals_1.equals(arrEquals_2));
        System.out.println("tung equalsIgnoreCase Tung: " + arrEquals_1.equalsIgnoreCase(arrEquals_2));

        System.out.println("-------------------------" );

        // compareTo() : sẽ trả về số âm, dương, và 0;
        // Nó so sánh các ký tự khác nhau và trừ đi theo bảng mã ASCII;

        System.out.println("Hàm compareTo so sánh các ký tự thwo bảng mã ASCII ");
        String sCompare_1 = "Vũ Thanh a";
        String sCompare_2 = "Vũ Thanh A";
        String sCompare_3 = "Vũ Thanh B";
        String sCompare_4 = "Vũ Thanh C";

        System.out.println("Vũ Thanh A compareTo Vũ Thanh a : " + sCompare_2.compareToIgnoreCase(sCompare_1));
        System.out.println("Vũ Thanh A compareTo Vũ Thanh A: " + sCompare_2.compareTo(sCompare_1));
        System.out.println("Vũ Thanh A compareTo Vũ Thanh B: " + sCompare_2.compareTo(sCompare_3));
        System.out.println("Vũ Thanh A compareTo Vũ Thanh C: " + sCompare_2.compareTo(sCompare_4));

        System.out.println("-------------------------" );
        //regionMatches(...) So sánh một đoạn
        //regionMatches(start index, string 2, start index 2, end index 2)
        String regionMatches_1 = "tung";
        String regionMatches_2 = "ung";
        System.out.println("tung regionMatches ung: " + regionMatches_1.regionMatches(1,regionMatches_2,0,3));

        System.out.println("-------------------------" );

        // startWith => Hàm kiểm tra chuỗi bắt đầu bằng ...
        // endWith => Hàm kiểm tra chuỗi kết thúc bằng ...
        String startWith_1 = "Vũ Thanh Tùng";
        String startWith_2 = "Vũ Minh Đức";
        String startWith_3 = "Ngu Tấn Sịp";
        System.out.println("Vũ Thanh Tùng start with Vũ ?: " + startWith_1.startsWith("Vũ"));
        System.out.println("Vũ Minh Đức start with Vũ ?: " + startWith_2.startsWith("Vũ"));
        System.out.println("Ngu Tấn Sịp start with Vũ ?: " + startWith_3.startsWith("Vũ"));

        System.out.println("-------------------------" );

        // indexOf(): Tìm kiếm từ trái sang phải
        // LastIndexof(): Tìm kiếm từ phải sang trái
        String indexOf_1 = "0123,0234";
        System.out.println("Tìm số 3 trong 0123,0234: " + indexOf_1.indexOf("3"));
        System.out.println("Tìm số 3 trong 0123,0234 nhưng bắt đầu từ vị trí số 4: " + indexOf_1.indexOf("3",4));

        System.out.println("-------------------------" );
        //Concat() nối 2 chuỗi
        String concat_1 = "Vũ";
        String concat_2 = "Thanh";
        String concat_3 = "Tùng";
        System.out.println("Hàm con concat nối 3 string lại: " + concat_1.concat(concat_2).concat(concat_3));

        System.out.println("-------------------------" );
        //replaceAll => không làm thay đổi chuỗi gốc
        String replaceALL_1 = "Vũ Thanh Tùng";
        System.out.println("Trước khi đổi:  " + replaceALL_1);
        String result = replaceALL_1.replaceAll("Thanh Tùng","Minh Đức");
        System.out.println("Sau khi đổi và không làm thay đổi chuỗi gốc: " + result);

        // subString => Cắt chuỗi con
        // subString (start index, end index)
        String s1 = "Vũ Thanh Tùng";
        System.out.println(s1.substring(9));
        System.out.println(s1.substring(3,10));
    }


}
