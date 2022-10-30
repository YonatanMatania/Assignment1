import java.util.Scanner;
public class Assignment1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        char ch1 = s.charAt(0);
        if (s.length()>2)
        {
            char ch2 = s.charAt(2);
            int i = Character.getNumericValue(ch2);
            System.out.println("New char is " +(char) (-i+ch1) + ".");
        }else
        {
            char ch2 = s.charAt(1);
            int i = Character.getNumericValue(ch2);
            System.out.println("New char is " +(char) (i+ch1) + ".");
        }


    }
}