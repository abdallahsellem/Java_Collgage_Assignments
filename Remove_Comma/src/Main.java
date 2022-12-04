import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       String data ;
        Scanner sc =new Scanner(System.in) ;
        data= sc.nextLine();
        String new_data="" ;
        for(int i=0 ;i<data.length();i++)
        {
            if(data.charAt(i)!=',')
            {
              new_data+=data.charAt(i) ;
            }
        }
        System.out.println(new_data);
    }
}