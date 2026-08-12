package ExceptionHandling;

import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.Scanner;

public class ExceptionDemoThrow {
    static void find(int x) throws SQLException, ClassNotFoundException{
        if (x%2 == 0){
            throw new ArithmeticException("Even number - Arithematic error");
        }
        else if(x % 3 == 0){
            throw new NullPointerException("Divisble by 3 - null pointer");
        }
        else if(x % 5 == 0){
            throw new SQLException("Divisible by 5 -- file not found");
        }
        else if(x % 7 == 0){
            throw new ClassNotFoundException("Divisible by 7 -- class not found");
        }
        else{
            System.out.println("No exception for: "+ x);
        }
    }
    public static void main(String[] args) {
//        find(2);
//        find(3);
        Scanner in = null;
        try {
           in = new Scanner(System.in);
//            find(7); //Throws a class not found exception
//            find(11); //No exception
            find(5);
            in.close();
            System.out.println("Inside try block");

        }

        catch(SQLException e){
            System.out.println("SQL Exception in find" + e.getMessage());
        }
        catch(ClassNotFoundException e){
            System.out.println("Class not found exception"+ e.getMessage());
        }
        catch(Exception e){
            System.out.println("Something unexpected: "+ e.getMessage());
        }
        finally {
            //Always run - exception or not
            in.close();
            System.out.println("clean up- releasing resources");
        }
        System.out.println("Statement after try catch finally");
    }

}
