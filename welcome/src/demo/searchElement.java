package demo;
import java.util.ArrayList;
import java.util.Scanner;
public class searchElement {
public static void main(String[] args) {
	     
        String searchElement;
        ArrayList<String> emailID = new ArrayList<String>();
        
        emailID.add("simon.hasler@gmx.com");
        emailID.add("leonie.klein@gmx.com");
        emailID.add("lea.hoch@gmx.com");
        emailID.add("max.neumann@gmx.com");
        emailID.add("henrik.fiesler@gmx.com");
        emailID.add("laura.kramm@gmx.com");
        emailID.add("sabine.neuwirth@gmx.com");
        
         // new code
         String searcElement = null;
         System.out.println("Enter the email to search");
         Scanner sc = new Scanner(System.in);
         searchElement = sc.nextLine();
           
           if (searchElement == null) {
                System.out.println("You haven't entered an email");
                return;
           }
                 for(int i=0; i<emailID.size(); i++) {
                    
                    System.out.println(emailID.get(i));
                    
                    if(searcElement==emailID.get(i)) {
                        
                        System.out.println("\n");
                        
                        System.out.println("email ID" + searcElement + "found");
                        
                        break;
                        
                    }
                }

    }

}
