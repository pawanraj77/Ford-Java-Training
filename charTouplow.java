import java.util.Scanner;
public class charTouplow {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the no.");
        int n = s.nextInt();
        if(n>5)
        {
            System.out.println("its valid no.");
        }
        else{
            System.out.println("its invalid");
        }
    }
}
