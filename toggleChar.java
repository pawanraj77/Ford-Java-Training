public class toggleChar {
    public static void main(String[] args)
    {
        char str[] = "gFgH".toCharArray();
        for(int i=0; i<str.length; i++)
        {
            if(str[i]>='A' && str[i]<='Z')
                str[i] = (char) (str[i] + 'a' - 'A');
            else if(str[i]>='a' && str[i]<='z')
            {
                str[i] = (char) (str[i] + 'A' - 'a');
            }
        }
        System.out.println(String.valueOf(str));

    }

}


