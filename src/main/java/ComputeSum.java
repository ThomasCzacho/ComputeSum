import java.util.Scanner;

public class ComputeSum {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int sum=0,howMany=0;

        System.out.print("Enter a number (0 to quit): ");
        int number = console.nextInt();

        while(!(number==0)){
            sum = sum + number;

            System.out.print("Enter number (0 to quit): ");
            number = console.nextInt();
            howMany++;


        }
        System.out.println("\nSum of "+howMany+" numbers: "+sum);


    }
}
