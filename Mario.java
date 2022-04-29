import java.util.Scanner;

public class Mario {
    public static void main(String[] args)  {
        Scanner input = new Scanner(System.in);


        System.out.println("Enter height of pyramid");
        int num = 0;

        while (true) {
            num= input.nextInt();

            if (num<0|| num> 8) {
                System.out.println("try again");
                continue;
            }
            else if(num>0 || num<8){
                System.out.println("great");
            }

            //Print right side
            System.out.println("Right aligned pattern");
            for(int i=1;i<=num;i++){

                for(int num2=num;num2>i;num2--)
                    System.out.print(" ");

                //Print # character
                for(int j=1;j<=i;j++)
                    System.out.print("#");
                System.out.print("\n");
            }
        }
    }
}
