import java.util.Scanner;

public class switchcase3
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int name;
        System.out.println("Enter a Roll NO : ");
        name = scan.nextInt();
        {
            switch (name)
            {
                case 1:
                    System.out.println("Pratiksha");
                    break;
                case 2:
                    System.out.println("Harshada");
                    break;
                case 3:
                    System.out.println("Payal");
                    break;
                case 4:
                    System.out.println("Tejaswini");
                    break;
                case 5:
                    System.out.println("Deepisha");
                    break;
                case 6:
                    System.out.println("Dhanashree");
                    break;
                default:
                    System.out.println("Enter valid Roll no...!!!");
            }
        }
    }
}
