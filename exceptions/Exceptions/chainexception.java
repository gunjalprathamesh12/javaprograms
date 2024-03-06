package exceptions.Exceptions;

public class chainexception {
    public static void main(String[] args) {
        int  result = 0;
        try {
            result = 20 / 0;
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("EXCEPTION" + e);
            try {
                throw new NumberFormatException();
            } catch (NumberFormatException e1) {
                System.out.println(e1);
            }

        }
    }
}
