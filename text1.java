package class328;

import java.util.Scanner;

public class text1 {
    public static void main(String[] args) {
        Scanner  in = new Scanner(System.in);
        System.out.println("请输入一个数");
        int a;
        a = in.nextInt();
        for(int i=1;i<=2*a-1;i++){
           for(int b=1;b<=a;b++){
               System.out.println("*");
           }
        }
    }
}
