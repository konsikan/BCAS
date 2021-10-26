/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chartedflightseatbbookingsystem;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Venus PC care
 */
public class CustomerDetails {
    LinkedList userName = new LinkedList();
    LinkedList password = new LinkedList();
    LinkedList firstName = new LinkedList();
    LinkedList lastName = new LinkedList();
    LinkedList address = new LinkedList();
    LinkedList phone = new LinkedList();
    LinkedList email = new LinkedList();
    
    LinkedList adminUserName = new LinkedList();
    LinkedList adminPassword = new LinkedList();
    /**
     * @param args the command line arguments
     */
 
    public void customerIn(){  
            CustomerDetails demo = new CustomerDetails();
            int h = 1;
            while (h == 1) {
                System.out.println();
                System.out.println("=================================");
                System.out.println("| 1-LOGIN | 2-CREAT NEW ACCOUNT |");
                System.out.println("=================================");
                System.out.println();
                Scanner input = new Scanner(System.in);
                System.out.print("SELECT\t: ");
                int select = input.nextInt();
                System.out.println();
                if (select==1){
                    demo.logInCustomer();
                }else if (select==2){
                    demo.signUpCustomer();
                    h = 1;
                }else{
                    System.out.println("!! INCORRECT VALUE !!");
                    System.out.println("     -TRY AGAIN-  ");
                }
            }   
    }
    public void signUpCustomer(){      
                Scanner input = new Scanner(System.in); 
                System.out.println("================");
                System.out.println("[CREATE ACCOUNT]");
                System.out.println("================");
                System.out.println();
                System.out.print("FIRST NAME\t: ");
                firstName.add(input.nextLine());
                System.out.print("LAST NAME\t: ");
                lastName.add(input.nextLine());
                System.out.print("ADDRESS\t: ");
                address.add(input.nextLine());
                System.out.print("PHONE NUMBER\t: ");
                phone.add(input.nextLine());
                System.out.print("E-MAIL\t: ");
                email.add(input.nextLine());
                System.out.print("USER NAME\t: ");
                userName.add(input.nextLine());
                System.out.print("PASSWORD\t: ");
                password.add(input.nextLine());
                System.out.println();
                System.out.println("$$ YOUR ACCOUNT WAS SUCCESSFULLY CREATED $$");
                System.out.println();
    }
    public void logInCustomer(){ 
                Scanner input = new Scanner(System.in);                   
                userName.add("Konsikan");
                password.add("Jkonsikan1");                  
                System.out.println("=======");
                System.out.println("[LOGIN]");
                System.out.println("=======");
                int correction = 1;
                while (correction == 1) {
                        System.out.println();
                        System.out.print("USER NAME\t: ");
                        String inputusername = input.next();
                        System.out.print("PASSWORD\t: ");
                        String inputpassword = input.next();
                        String message = "| $ YOU ARE LOGGED IN AS A CUSTOMER $ |";
                        for(int i=0; i<userName.size(); i++){   
                            if (inputusername.equals(userName.get(i)) && inputpassword.equals(password.get(i))) {
                                message = "| $ YOU ARE LOGGED IN AS A CUSTOMER $ |";
                                correction=0;
                                break;
                            } else {
                                correction = 1;
                                message = "| !! INCORRECT USER NAME & PASSWORD !! |";    
                            }
                        }  
                        System.out.println();
                        System.out.println(message);
                }
    }
    public void logInAdmin(){ 
                Scanner input = new Scanner(System.in);                   
                adminUserName.add("Admin");
                adminPassword.add("Admin123");                  
                System.out.println("=======");
                System.out.println("[LOGIN]");
                System.out.println("=======");
                int correction = 1;
                while (correction == 1) {
                        System.out.println();
                        System.out.print("USER NAME\t: ");
                        String inputusername = input.next();
                        System.out.print("PASSWORD\t: ");
                        String inputpassword = input.next();
                        String message = "| $ YOU ARE LOGGED IN AS AN ADMIN$ |";
                        for(int i=0; i<adminUserName.size(); i++){   
                            if (inputusername.equals(adminUserName.get(i)) && inputpassword.equals(adminPassword.get(i))) {
                                message = "| $ YOU ARE LOGGED IN AS AN ADMIN$ |";
                                correction=0;
                                break;
                            } else {
                                correction = 1;
                                message = "| !! INCORRECT USER NAME & PASSWORD !! |";    
                            }
                        }  
                        System.out.println();
                        System.out.println(message);
                }
    }
    
}
