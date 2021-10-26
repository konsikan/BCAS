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
public class Bookings {
     
  public int[] flightNo = new int[7];
  public  String[] flightName = new String[7];
    
  public  String[] countries = new String[8];
    
  public String[][] destinations = new String[8][4];
  public String[] time = new String[5];  

        

    public void destinations(){  
        flightNo[0]=1001;
        flightNo[1]=1002;
        flightNo[2]=1003;
        flightNo[3]=1004;

        flightName[0]="Ceylance";
        flightName[1]="Starter K";
        flightName[2]="Ceylance 2";
        flightName[3]="Kexon Jet";

        countries[0]="London";
        countries[1]="Canada";
        countries[2]="Singapore";
        countries[3]="Mumbai";
        countries[4]="Mexico";
        countries[5]="Dubai";
        countries[6]="India";
        countries[7]="USA";
        
        time[0]="9";
        time[1]="2";
        time[2]="4";
        time[3]="5";
        time[4]="6";
        
        destinations[0][0]=countries[0]+" "+flightNo[0]+" "+flightName[0]+" |"+time[0]+"AM"; 
        destinations[0][1]=countries[0]+" "+flightNo[1]+" "+flightName[1]+" |"+time[4]+"PM";
        destinations[0][2]=countries[0]+" "+flightNo[2]+" "+flightName[2]+" |"+time[2]+"AM";
        
        destinations[1][0]=countries[1]+" "+flightNo[3]+" "+flightName[3]+" |"+time[3]+"PM";
        destinations[1][1]=countries[1]+" "+flightNo[1]+" "+flightName[1]+" |"+time[1]+"AM";
        destinations[1][2]=countries[1]+" "+flightNo[0]+" "+flightName[0]+" |"+time[4]+"PM";
        
        destinations[2][0]=countries[2]+" "+flightNo[2]+" "+flightName[2]+" |"+time[0]+"AM";
        destinations[2][1]=countries[2]+" "+flightNo[1]+" "+flightName[1]+" |"+time[2]+"PM";
        destinations[2][2]=countries[2]+" "+flightNo[3]+" "+flightName[3]+" |"+time[3]+"AM";
        
        destinations[3][0]=countries[3]+" "+flightNo[3]+" "+flightName[3]+" |"+time[2]+"PM";
        destinations[3][1]=countries[3]+" "+flightNo[0]+" "+flightName[0]+" |"+time[1]+"AM";
        destinations[3][2]=countries[3]+" "+flightNo[1]+" "+flightName[1]+" |"+time[3]+"PM";

        destinations[4][0]=countries[4]+" "+flightNo[3]+" "+flightName[3]+" |"+time[2]+"PM";
        destinations[4][1]=countries[4]+" "+flightNo[0]+" "+flightName[0]+" |"+time[1]+"AM";
        destinations[4][2]=countries[4]+" "+flightNo[1]+" "+flightName[1]+" |"+time[3]+"PM";
        
        destinations[5][0]=countries[5]+" "+flightNo[3]+" "+flightName[3]+" |"+time[2]+"PM";
        destinations[5][1]=countries[5]+" "+flightNo[0]+" "+flightName[0]+" |"+time[1]+"AM";
        destinations[5][2]=countries[5]+" "+flightNo[1]+" "+flightName[1]+" |"+time[3]+"PM";
        
        destinations[6][0]=countries[6]+" "+flightNo[3]+" "+flightName[3]+" |"+time[2]+"PM";
        destinations[6][1]=countries[6]+" "+flightNo[0]+" "+flightName[0]+" |"+time[1]+"AM";
        destinations[6][2]=countries[6]+" "+flightNo[1]+" "+flightName[1]+" |"+time[3]+"PM";
        
        destinations[7][0]=countries[7]+" "+flightNo[3]+" "+flightName[3]+" |"+time[2]+"PM";
        destinations[7][1]=countries[7]+" "+flightNo[0]+" "+flightName[0]+" |"+time[1]+"AM";
        destinations[7][2]=countries[7]+" "+flightNo[1]+" "+flightName[1]+" |"+time[3]+"PM";
        
        
        int h = 1;
        while (h == 1) {
            System.out.println();
            System.out.println("==============================================");
            System.out.println("| 1-Flight Destinations | 2-Booking Details |");
            System.out.println("==============================================");
            System.out.println();
            Scanner input = new Scanner(System.in);
            System.out.print("SELECT\t: ");
            int select = input.nextInt();
            System.out.println();
            if (select==1){
                for(int j=0; j<countries.length-1; j++){

                            System.out.println(j+1+" | "+countries[j]);

                }
                System.out.println();
                System.out.println("CHOSE YOUR DESTINATIONS  ");
                System.out.println();
                System.out.print("SELECT\t: ");
                int select2 = input.nextInt();
                System.out.println();
                System.out.println("     - YOU HAVE SELECTED YOUR DESTINATION AS ' "+countries[select2-1]+" ' -   ");
                System.out.println();
                System.out.println("HERE IS AVAILABLE FLIGHTS & TIME FOR ' "+countries[select2-1]+" ' ");
                System.out.println();
                int count=0;
                    for(int j=0; j<destinations[select2-1].length-1; j++){
                                    count=count+1;
                                    System.out.println(count+" "+destinations[select2-1][j]);               
                    }
                    System.out.println();
                    System.out.println("CHOOSE YOUR AVAILABILITY");
                    System.out.println();
                    Scanner input2 = new Scanner(System.in);
                    System.out.print("SELECT\t: ");
                    int select3 = input.nextInt();
                    System.out.println(); 
                    System.out.println("     - YOU HAVE SELECTED YOUR DESTINATION AS ' "+destinations[select2-1][select3-1]+" ' -   ");
                    System.out.println();
                    System.out.println("HOW MANY SEATS YOU NEED TO BOOK? ");
                    Scanner input3 = new Scanner(System.in);
                    System.out.print("SEAT COUNT\t: ");
                    int seatCount = input.nextInt();
                    System.out.println();
                    System.out.println("     - ENTER PASSANGER DETAILS -     ");
                    System.out.println();
                    
            }else if (select==2){
                System.out.println();
                System.out.println("!! NOW YOU DON'T HAVE ANY BOOKING HISTORY !!");
                System.out.println();

            }else{
                h = 1;
                System.out.println("!! INCORRECT VALUE !!");
                System.out.println("     -TRY AGAIN-  ");
            }
        }   
        
    }
    
    public static void main(String[] args) {
        Bookings demo = new Bookings(); 
        demo.destinations();
    }
    
}
