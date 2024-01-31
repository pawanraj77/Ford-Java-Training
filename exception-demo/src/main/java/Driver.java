public class Driver {
    public static void main(String[] srgs) {
        Integer[] nums = {1, 2, 3, 4, 5};
        System.out.println(nums[2]);


        try { //write business logic
//            System.out.println(nums[5]);
            String name = null;
//            name.toLowerCase();
//            int num = 10/0;

            System.out.println("next statement");
        }
        catch (ArrayIndexOutOfBoundsException e) { //write exception handling logic
            System.out.println(e.getMessage());
        }
        catch (NullPointerException e) { //write exception handling logic
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("finally block always gets executed here");
        }

        try{
            funcA();
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }


        System.out.println("normal termination of app");
    }

    static void funcA() {
        int num = 10 / 0;
    }
}
