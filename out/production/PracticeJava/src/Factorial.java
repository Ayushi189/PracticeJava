import java.util.Scanner;

public class Factorial {

    public int getFact(int number){
        int fact=1;
        for(int i=1;i<=number;i++){
            fact=fact*i;
        }
        return fact;
    }

    public static void main(String[]args){
        int number;
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter any num");
        number=scanner.nextInt();

        Factorial factorial = new Factorial();
        int fact = factorial.getFact(number);
        System.out.println("factorial is:"+fact);

    }
}
