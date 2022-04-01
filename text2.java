package class330;

public class text2 {
    public static void main(String[] args) {
        for(int i=1;i<=4;i++){
            for(int j=1;j<=10;j++){
                if(i==1 || j==10){
                    continue;
                }else {

                    System.out.println("第" + i + "行" + "第" + j + "列");
                }
            }
        }
    }
}
