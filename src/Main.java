//write a java program that stimulates a simple atm machine
// the program prompts a customer for atransaction code
//1- withdrawal
//2- deposit
//3- check balance
//4- exit
// use the if else statement

import javax.swing.JOptionPane;
import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int withdrawal /*/= scanner.nextInt();*/ ;
        int deposit;
        int balance;
        int exit;
        int option=0;
        int amount;
        int pin=2005;
        int language;
        int n=1;

       while (n<=3)
       {
           System.out.println("Enter your preferred language\n1.English\n2.Pidgin\n");
           language = scanner.nextInt();
           if (language == 1)
           {
               System.out.println("KINDly INPUT YOUR PIN\n");
               pin = scanner.nextInt();
               if (pin == 2005) {
                   System.out.println("Hello Welcome to your banking\nPress 1. Withdrawal\n2.Deposit\n3.Balance\n4.Exit\n");
                   option = scanner.nextInt();
                   if (option == 1) {
                       System.out.println("Input the amount you would want to withdraw\n1. 2000\t\t\t\t\t2.5000\n3. 10000\t\t\t\t\t20000\n");
                       amount = scanner.nextInt();

                       System.out.println("----------------------------------------------------------\nKindly collect your cash\n");
                       System.out.println("Would you like to make another transaction?\n1.Yes\n2.No");
                       option = scanner.nextInt();
                       if (option == 1) {
                           System.out.println("......................loading....................");

                           n++;
                       } else {
                           System.out.println("Kinly take out your card\n");
                       }


                    }else if (option == 2) {
                       System.out.println("Kindly input the amount you would you like to deposit?\n");
                       deposit = scanner.nextInt();
                       System.out.println("Would you like to make another transaction?\n1.Yes\n2.No");
                       option = scanner.nextInt();
                       if (option == 1) {
                           System.out.println("......................loading....................");

                           n++;
                       } else {
                           System.out.println("Kinly take out your card\n");
                       }

                   } else if (option == 3) {
                       System.out.println("Your account balanance is\n-------------------------------\nN xxxxxx");
                       System.out.println("Would you like to do any other thing?\n1.Yes\n2.No\n");
                       option = scanner.nextInt();
                       if (option == 1) {
                           System.out.println("......................loading....................");

                           n++;
                       } else {
                           System.out.println("kindly remove your card\n");
                       }
                   }
               } else if (option == 4) {
                   System.out.println("Safe\n");
               }

            else {
               System.out.println("You have entered an incorrect pin");
               System.out.println("Try again\n");
               n++;
           }
       }else if (language == 2) {
               System.out.println("Howfar, welcome to the bank\nPress  1. Withdrawal\n2.Deposit\n3.Balance\n4.Exit\n");
               option = scanner.nextInt();
               if (option == 1) {
                   System.out.println("oya choose the amount wey wan  withdraw\n1. 2000\t\t\t\t\t2.5000\n3. 10000\t\t\t\t\t20000\n");
                   amount = scanner.nextInt();

                   System.out.println("----------------------------------------------------------\nOya collect your cash\n");
                   System.out.println("You go like  make another transaction?\n1.Yes\n2.No");
                   option = scanner.nextInt();
                   if (option == 1) {
                       System.out.println("......................loading....................");

                       n++;
                   } else {
                       System.out.println("Oya remove your card\n");
                   }

               } else if (option == 2) {
                   System.out.println("How much you go like deposit?\n");
                   deposit = scanner.nextInt();
                   System.out.println("You go like make another transaction?\n1.Yes\n2.No");
                   option = scanner.nextInt();
                   if (option == 1) {
                       System.out.println("......................loading....................");

                       n++;
                   } else {
                       System.out.println("Oya remove your card\n");
                   }

               } else if (option == 3) {
                   System.out.println("Your account balanance is\n-------------------------------\nN xxxxxx");
                   System.out.println("You go like do any other thing?\n1.Yes\n2.No");
                   option = scanner.nextInt();
                   if (option == 1) {
                       System.out.println("......................loading....................");

                       n++;
                   } else {
                       System.out.println("Oya remove your card\n");
                   }
               } else if (option == 4) {
                   System.out.println("Safe\n");
               }
           }
       }
       }
    }
