package Banking_System;
import java.util.Scanner;
public class Bank_System {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int curr, dep,ch;
        System.out.println("------Enter the Current Amount--------");
        curr = scn.nextInt();
        scn.nextLine();
        boolean flag = true;
        while (flag != false){
            System.out.println("1. Deposit Amount");
            System.out.println("2. Withdraw Amount");
            System.out.println("3. Display Amount");
            System.out.println("4. Exit");
            System.out.println("Enter the choice");
            ch = scn.nextInt();
            switch (ch){
                case 1:
                    System.out.println("Enter the deposit Amount");
                    dep = scn.nextInt();
                    System.out.println("Amount is : "+ (dep+curr));
                    break;
                case 2:
                    System.out.println("Enter the withdraw amount");
                    int amount = scn.nextInt();
                    if(amount > curr){
                        System.out.println("Insufficient Amount");
                    }else{
                        curr = curr-amount;
                    }
                    break;
                case 3:
                    System.out.println("Your current Amount is "+curr);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Enter the correct choice");
            }
            if(ch != 4){
            System.out.println("Do you want to continue ? Enter choice y/n");
            String str = scn.next();
                if (str.equalsIgnoreCase("y")) {
                    flag = true;
                } else {
                    flag = false;
                }
            }else{
                break;
            }
        }

    }
}
