import java.util.InputMismatchException;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        int n = 0;
        while ( true )
        {
            System.out.println("Введите число строк");
            Scanner sc1 = new Scanner(System. in );
            try
            {
                n = sc1.nextInt();
                break;
            }
            catch(InputMismatchException fg)
            {
                System.out.print("Вы ввели не число. " );
            }
        }
        String[] str = new String[n];
        Scanner sc2 = new Scanner(System.in);
        for (int i = 0; i < n; i++)
        {
            System. out.println( " Введите строку №" + (i+1));
            str[i] = sc2.nextLine();
        }
        for ( int i = 0; i < str. length -1; i++)
        {
            for (int j = i+1; j < str.length; j++)
            {
                if (str[i].length()<str[j].length())
                {
                    String temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }
        System.out.println("Самая короткая строка: " + str[n-1] + " её длина = " + str[n-1].length());
    }
}
