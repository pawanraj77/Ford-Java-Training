public class CustomExceptionDriver {

    public static void main(String[] srgs) {

        try {
            functionA(-10);
        }
        catch (CustomException e){
//            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

    static void functionA(int num) throws CustomException{
        if(num<0)
            throw new CustomException("number is -ve");
    }
}
