import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int base;
        int power;
        int total=1;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        base = input.nextInt();
        System.out.println("Enter a positive power: ");
        power= input.nextInt();

        for(int i=1;i<=power;i++){
            total=total*base;
        }
        System.out.println("Result= "+total);


    }
}