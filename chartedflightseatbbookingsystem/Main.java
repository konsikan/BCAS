/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chartedflightseatbbookingsystem;

import java.util.Scanner;

/**
 *
 * @author Venus PC care
 */
public class Main {
    
     public static void main(String[] args) {
         Main demo = new Main();
         demo.login();
     }
     public void login(){ 
            Details demo = new Details(); 
            int h = 0;
            while (h == 0) {
                System.out.println();
                System.out.println("=================================");
                System.out.println("| 1-Admin | 2-Customer |");
                System.out.println("=================================");
                System.out.println();
                Scanner input = new Scanner(System.in);
                System.out.print("SELECT\t: ");
                int select1 = input.nextInt();
                System.out.println();
                if (select1==1){
                    demo.logInAdmin();
                    break;
                }else if (select1==2){
                    while (h == 0) {
                        System.out.println();
                        System.out.println("==============================================================================");
                        System.out.println("| 1-Existing Customer[Login] | 2-Non-Existing Customer[Register New Account] |");
                        System.out.println("==============================================================================");
                        System.out.println();
                        System.out.print("SELECT\t: ");
                        int select2 = input.nextInt();
                        System.out.println();
                        if (select2==1){
                            demo.logInCustomer();
                            break;
                        }else if (select2==2){
                            demo.signUpCustomer();
                            break;
                        }else{
                            System.out.println("!! INCORRECT VALUE !!");
                            System.out.println("     -TRY AGAIN-  ");
                        }
                    }  
                break;
                }else{
                    System.out.println("!! INCORRECT VALUE !!");
                    System.out.println("     -TRY AGAIN-  ");
                }
            }   
    }
    
}
