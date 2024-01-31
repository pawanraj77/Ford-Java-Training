import java.util.Scanner;

public class substring {
    public static void main(String[] args)
    {
        String text = "hello I am pawan from ford motors";
        Scanner s = new Scanner(System.in);
        String str = s.next();

        boolean ans = text.contains(str);
        if(ans)
        {
            System.out.println("its present");
        }
        else{
            System.out.println("its not present");
        }
    }
}
