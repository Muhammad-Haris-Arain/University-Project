package com.classes;
import java.util.Scanner;

public class UMF_FOOD {

    public static void main(String[] args) {
        // write your code here
        double Burger_bread_prise, chatni, mayonese, ketchup, Roll_pratha_prise,salid, chicken_per_burger, oil_per_burger;
        int Chicken_per_roll, oil_per_roll, /*patatos_per_kilo*/ Onion_per_roll, finger_chips,cheese,cheese_sause;
       // (Upcoming) double salary_of_workers;
        int x;
        char while_opt;
        double average1,average2,average3,average4,average5;
        double arr[]=new double[10]; // Array to store our data.


        Scanner scan = new Scanner(System.in);

        // For the making of one Product .Calculating the prize of total Indridients used in product.After giving total cost of single product.
        do {
            System.out.println("Press 1 To Cost Turkish Steak Burger,, 2 for Zinger Burger,, 3 For Azhri Grilled Burger,, 4 for Special Roll Pratha,, 5 For Turkish Roll Pratha");
            x=scan.nextInt();

             // Turkish Steak Burger
            if (x==1) {
                System.out.println("Give Prize for Bread per burger :");
                Burger_bread_prise = scan.nextDouble();
                System.out.println("Give Prize for Cheese");
                cheese=scan.nextInt();
                System.out.println("Give Prize For Cheese_sauce per Burger :");
                cheese_sause=scan.nextInt();
                System.out.println("Give Prize for chatnies");
                chatni = scan.nextDouble();
                System.out.println("Give Prize for mayonese per burger :");
                mayonese = scan.nextDouble();
                System.out.println("Give Prize for ketchup per burger :");
                ketchup = scan.nextDouble();
                System.out.println("Give Prize for salid :");
                salid = scan.nextDouble();
                System.out.println("Give Prize for Oil per burger :");
                oil_per_burger = scan.nextDouble();

                //  for Turkish Steak Burger Calculation.
                average1 = Burger_bread_prise+ cheese_sause + chatni + mayonese + ketchup + salid + oil_per_burger +cheese;
                arr[0]=average1; // Storing the data in array.
                System.out.println("Cost for one Turkish Steak Burger is :" + average1);
            }

            // Zinger Burger.
            if (x == 2) {
                System.out.println("Give Prize for Bread per burger :");
                Burger_bread_prise = scan.nextDouble();
                System.out.println("Give Prize for Cheese_Sauce Used per Burger :");
                cheese_sause=scan.nextInt();
                System.out.println("Give Prize for chatnies");
                chatni = scan.nextDouble();
                System.out.println("Give Prize for mayonese per burger :");
                mayonese = scan.nextDouble();
                System.out.println("Give Prize for ketchup per burger :");
                ketchup = scan.nextDouble();
                System.out.println("Give Prize for salid :");
                salid = scan.nextDouble();
                System.out.println("Give Prize for Oil per burger :");
                oil_per_burger = scan.nextDouble();
                System.out.println("Give Prize for Egg per burger :");
                System.out.println("\nGive Prize for Chicken per Burger :");
                chicken_per_burger = scan.nextDouble();
                System.out.println("Give Prize for Finger chips :");
                finger_chips = (int) scan.nextDouble();

                //  for Zinger Burger Calculation.
                 average2 = Burger_bread_prise+ cheese_sause + chatni + mayonese + ketchup + salid + oil_per_burger + finger_chips + chicken_per_burger;
                 arr[1]=average2; //Storing the data in array
                 System.out.println("\nCost for one Zinger Burger is :" + average2);
            }
             // Azhri Grilled Burger.
            if (x == 3) {
                System.out.println("Give Prize for Bread per burger :");
                Burger_bread_prise = scan.nextDouble();
                System.out.println("Give prize for cheese per Burger :");
                cheese=scan.nextInt();
                System.out.println("Give Prize for Cheese sause used in per Burger :");
                cheese_sause=scan.nextInt();
                System.out.println("Give Prize for chatni");
                chatni = scan.nextDouble();
                System.out.println("Give Prize for mayonese per burger :");
                mayonese = scan.nextDouble();
                System.out.println("Give Prize for ketchup per burger :");
                ketchup = scan.nextDouble();
                System.out.println("Give Prize for salid :");
                salid = scan.nextDouble();
                System.out.println("Give Prize for Oil per burger :");
                oil_per_burger = scan.nextDouble();
                System.out.println("Give Prize for Egg per burger :");
                System.out.println("\nGive Prize for Chicken per Burger :");
                chicken_per_burger = scan.nextDouble();
                System.out.println("Give Prize for Finger chips :");
                finger_chips = (int) scan.nextDouble();

                //  for Chicken Burger Calculation.
                average3 = Burger_bread_prise+ cheese+ cheese_sause + chatni + mayonese + ketchup + salid + oil_per_burger + finger_chips + chicken_per_burger;
                arr[2]=average3; // Storing the data in array
                System.out.println("\nCost for one Azhri Grilled Burger is :" + average3);
            }


            // Calculation For The Cost Of One Special Roll Pratha.

            if (x == 4) {
                System.out.println("\nGive Prize for Pratha :");
                Roll_pratha_prise = scan.nextDouble();
                System.out.println("Give Prize for Chicken per Roll :");
                Chicken_per_roll = (int) scan.nextDouble();
                System.out.println("Give Pize for cheese_Sauce used per Burger :");
                cheese_sause=scan.nextInt();
                System.out.println("Give Prize for mayonese per roll :");
                mayonese = scan.nextDouble();
                System.out.println("Give Prize for ketchup per Roll");
                ketchup = scan.nextDouble();
                System.out.println("Give Prize for chatni per roll :");
                chatni = scan.nextDouble();
                System.out.println("Give Prize for Onion per roll");
                Onion_per_roll = (int) scan.nextDouble();
                System.out.println("Give Prize for Oil per roll :");
                oil_per_roll = (int) scan.nextDouble();

                average4 = Roll_pratha_prise + Chicken_per_roll+ cheese_sause + mayonese + ketchup + chatni + Onion_per_roll + oil_per_roll;
                arr[3]=average4; // Storing the data in array
                System.out.println("\nCost for one Special Roll Pratha is :" + average4);
            }

            if (x == 5) {
                System.out.println("\nGive Prize for Pratha :");
                Roll_pratha_prise = scan.nextDouble();
                System.out.println("Give Prize for Chicken per Roll :");
                Chicken_per_roll = (int) scan.nextDouble();
                System.out.println("Give Prize for cheese_Sauce used per Burger :");
                cheese_sause=scan.nextInt();
                System.out.println("Give Prize for mayonese per roll :");
                mayonese = scan.nextDouble();
                System.out.println("Give Prize for ketchup per Roll");
                ketchup = scan.nextDouble();
                System.out.println("Give Prize for chatni per roll :");
                chatni = scan.nextDouble();
                System.out.println("Give Prize for Onion per roll");
                Onion_per_roll = (int) scan.nextDouble();
                System.out.println("Give Prize for Oil per roll :");
                oil_per_roll = (int) scan.nextDouble();

                average5 = Roll_pratha_prise+ cheese_sause + Chicken_per_roll + mayonese + ketchup + chatni + Onion_per_roll + oil_per_roll;
                arr[4]=average5; // Storing the data in array
                System.out.println("\nCost for one Turkish Roll Pratha is :" + average5);
            }

            System.out.println("\nGive Y to Perform this operation again and N For cancelation. ");
            while_opt=scan.next().charAt(0);
        }
        while (while_opt!='N');

        System.out.println("Data Stored in an array is ; ");

        for(int i=0; i<arr.length; i++)
            System.out.println(arr[i]);
    }
}

