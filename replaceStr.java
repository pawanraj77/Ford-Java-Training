import java.util.Scanner;

public class replaceStr {
    public static void main(String[] args)
    {
        String text = "hello good morning everyone";
        Scanner s = new Scanner(System.in);
        String target = s.next();
        Scanner str = new Scanner(System.in);
        String rep = str.next();
        String processed = text.replace(target, rep);
//        assertTrue(processed.contains(rep));
//        assertFalse(processed.contains(target));
        System.out.println(processed);
    }


}
