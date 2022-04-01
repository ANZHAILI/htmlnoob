package class330;

import java.util.Random;
import java.util.Scanner;

public class text4 {
    public static void main(String[] args) {
        Random r =new Random();
        Scanner in = new Scanner(System.in);
        int number = r.nextInt(100)+1;
        System.out.println("请输入一个数");
        int a;
       for(;;){
           a = in.nextInt();
        if(a<number){
            System.out.println("你猜的数据小了");

        }else if(a>number){
            System.out.println("你猜的数据大了");

        }else if(a==number) {
            System.out.println("你猜对了");
            break;
        }
        }
    }
}
