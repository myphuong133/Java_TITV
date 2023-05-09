package java62_Stack;

import java.util.Scanner;
import java.util.Stack;

public class java62_stack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<Integer>();
        System.out.println("Nhập 1 số nguyên dương từ bàn phím");
        int i = sc.nextInt();
        while (i>0){
            int x = i%2;
            System.out.println(x);
            stack.push(x);
            i = i/2;
        }
        int n = stack.size();
        for (int j = 0;j<n;j++){
            String st = String.valueOf(stack.pop());
        }
    }
}
