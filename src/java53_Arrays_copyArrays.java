import java.util.Arrays;

public class java53_Arrays_copyArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        //Copy = toán tử gán làm thay đổi giá trị của cả 2 mảng
        int[] copyArr = arr1;
        copyArr[0] = 100;
        System.out.println("array gốc : [1,2,3] ");
        System.out.println("---------------------------------------------");
        System.out.println("Dùng toán tử gán ");
        System.out.println("arr1: " + Arrays.toString(copyArr));
        System.out.println("toán tử gán: " + Arrays.toString(arr1));
        System.out.println("---------------------------------------------");
        // clone() =
        int[] copyArrWithClone = arr1.clone();
        copyArrWithClone[0] = 20;
        System.out.println("arr1: " + Arrays.toString(copyArr));
        System.out.println("hàm clone: " + Arrays.toString(copyArrWithClone));
        // System.arrayCopy
        int[] copyArrayUsingArrayCopy = new int[arr1.length];
        System.arraycopy(arr1,0,copyArrayUsingArrayCopy,0,arr1.length);
        System.out.println(Arrays.toString(copyArrayUsingArrayCopy));
        // System.array
    }
}
