
import java.util.Scanner;

public class DaysOfLife {

    public static void main(String[] args){
        Days();
    }
    public static void Days(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade");
            int Age = scanner.nextInt();
        System.out.println("O mês atual");
            int Month = scanner.nextInt();
        System.out.println("O dia atual");
            int Days = scanner.nextInt();


            int TotalDays = Age * 365 + Month * 30 + Days;

            String Space = " dias";

        System.out.println("Dias vividos são:" + TotalDays + Space);



    }
}
