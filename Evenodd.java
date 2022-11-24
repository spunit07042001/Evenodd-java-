import java.util.Scanner;
public class Evenodd {
	
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num=s.nextInt();
        int digit;
        int ev=0,odd=0;
        while(num>0){
            digit=num%10;
            num=num/10;
            if(digit%2!=0)
                odd=odd+digit;
            else
                ev=ev+digit;
        }
        System.out.println(ev+" "+odd);
    }
}







// import java.util.*;

// public class Evenodd {
//  public static void main(String args[]) {
    
//     Scanner sc = new Scanner(System.in);

//     int evensum=0;
//     int oddsum=0;
//     int number;
//     int choice; 


//     do {
        
//         System.out.print("enter the number");
//         number = sc.nextInt();

//         if (number%2 ==0){
//             evensum = number +evensum;

//         }
//         else{
//             oddsum= number+oddsum;
//         }
//         System.out.print("Do you want to continue? Press1 for yes or 0 for no");
        
//         choice= sc.nextInt();
//     }

//         while(choice==1);

//         System.out.println(evensum);
//         System.out.println(oddsum);
    
//  }    
// }
