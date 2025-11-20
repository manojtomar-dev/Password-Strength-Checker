import java.util.Scanner;

public class PasswordChecker 
	{
   	 public static void main(String[] args) 
	      {
        		Scanner sc = new Scanner(System.in);
                        System.out.print("Enter password: ");
        String password = sc.nextLine();

        if (password.length() < 6) 
{
            System.out.println("Weak password (too short)");
        } 
         else if (password.matches(".*[0-9].*") && password.matches(".*[A-Z].*") && password.matches(".*[@#$%^&+=!].*")) 
       {
            System.out.println("Strong password");
        } 
       else {
            System.out.println("Medium strength password");
        }

        sc.close();
    }
}
