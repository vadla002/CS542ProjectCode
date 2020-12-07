//package main.java;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;


public class Client {

    static String beverageType = "";

    public static void main(String[] args) {
        Steward steward = new Steward();
        Chef cook = new Chef();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("What do you want to order?");
            System.out.println("(1) IceCream");
            System.out.println("(2) Beverage");
            System.out.println("(3) Cancel");

            int choice = scanner.nextInt();
            if (choice == 1) {
                ArrayList<String> chocoList = new ArrayList<>();
                ArrayList<String> fruitList = new ArrayList<>();
                ArrayList<String> condimentList = new ArrayList<>();

                String iceCreamType = null;
                String answer = null;

                while (true) {
                    System.out.println("Which IceCream do you want?");
                    System.out.println("(1) Cup IceCream --- $5.0");
                    System.out.println("(2) Cone IceCream --- $4.0");

                    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
                    try {
                        answer = input.readLine();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

//                    assert answer != null;
                    if (answer.equals("1")) {
                        iceCreamType = "Cup IceCream";
                        System.out.println("*** Cup IceCream is chosen ***");
                        break;
                    } else if (answer.equals("2")) {
                        iceCreamType = "Cone IceCream";
                        System.out.println("*** Cone IceCream is chosen ***");
                        break;
                    } else {
                        continue;
                    }

                }
                System.out.println("");

                System.out.println("-------------------- DECORATORS --------------------");
                Scanner scan = new Scanner(System.in);
                for (int i = 0; i < 2; i++) {
                    System.out.println("-------------------- Chocolate Decorator --------------------");
                    System.out.println("(1) White Chocolate --- 1.5$");
                    System.out.println("(2) Dark Chocolate --- 1.25$");
                    System.out.println("(3) Done with Chocolate selection.");

                    int value = scan.nextInt();
                    if (value == 1) {
                        chocoList.add("White Chocolate");
                        System.out.println("*** White Chocolate is chosen ***");
                    } else if (value == 2) {
                        chocoList.add("Dark Chocolate");
                        System.out.println("*** White Chocolate is chosen ***");
                    } else {
                        break;
                    }
                }
                System.out.println("The selection of Chocolates is completed.");
                System.out.println("");

                Scanner scan2 = new Scanner(System.in);
                for (int i = 0; i < 3; i++) {
                    System.out.println("-------------------- Fruit Decorator --------------------");
                    System.out.println("(1) Cherry --- $1.0");
                    System.out.println("(2) DragonFruit --- $1.0");
                    System.out.println("(3) Kiwi --- $1.0");
                    System.out.println("(4) Done with fruit selection.");
                    int value = scan2.nextInt();
                    if (value == 1) {
                        fruitList.add("Cherry");
                        System.out.println("*** Cherry is chosen ***");
                    } else if (value == 2) {
                        fruitList.add("DragonFruit");
                        System.out.println("*** DragonFruit is chosen ***");
                    } else if (value == 3) {
                        fruitList.add("Kiwi");
                        System.out.println("*** Kiwi is chosen ***");
                    } else break;
                }
                System.out.println("The selection of Fruits is completed.");
                System.out.println("");

                Scanner scan3 = new Scanner(System.in);
                for (int i = 0; i < 3; i++) {
                    System.out.println("-------------------- Condiment Decorator --------------------");
                    System.out.println("(1) Jellies --- $0.5");
                    System.out.println("(2) Nuts --- $0.5");
                    System.out.println("(3) Sprinkles --- $0.5");
                    System.out.println("(4) Done with Condiment selection.");
                    int value = scan3.nextInt();
                    if (value == 1) {
                        condimentList.add("Jellies");
                        System.out.println("*** Jellies is chosen ***");
                    } else if (value == 2) {
                        fruitList.add("Nuts");
                        System.out.println("*** Nuts is chosen ***");
                    } else if (value == 3) {
                        fruitList.add("Sprinkles");
                        System.out.println("*** Sprinkles is chosen ***");
                    } else break;
                }
                System.out.println("The selection of Condiments is completed.");
                System.out.println("");

                String[] chocoArr = new String[chocoList.size()];
                chocoArr = chocoList.toArray(chocoArr);

                String[] fruitArr = new String[fruitList.size()];
                fruitArr = fruitList.toArray(fruitArr);

                String[] condimentArr = new String[condimentList.size()];
                condimentArr = condimentList.toArray(condimentArr);

                String flavor = "Strawberry";
                int scoops = 1;

                IceCream_Order iceCreamOrder = new IceCream_Order(cook, iceCreamType, chocoArr, fruitArr, condimentArr, flavor, scoops);
                steward.fulfillOrder(iceCreamOrder);
            } else if (choice == 2) {
                Scanner scanBeverage = new Scanner(System.in);
                System.out.println("-------------------- BEVERAGES --------------------");
                for (int i = 0; i < 1; i++) {
                    System.out.println("-------------------- Beverage Types --------------------");
                    System.out.println("(1) HotMocha --- $4.75");
                    System.out.println("(2) Cappuccino --- $4.25");
                    System.out.println("(3) Coke --- $2.0");
                    System.out.println("(4) Ice Tea --- $1.25");
                    System.out.println("(5) GoldSpot --- $1.50");
                    System.out.println("(6) Done with beverage selection.");
                    int drink = scanBeverage.nextInt();
                    if (drink == 1) {
                        beverageType = "HotMocha";
                        System.out.println("*** HotMocha is chosen.");
                    } else if (drink == 2) {
                        beverageType = "Cappuccino";
                        System.out.println("*** Cappuccino is chosen.");
                    } else if (drink == 3) {
                        beverageType = "Coke";
                        System.out.println("*** Coke is chosen.");
                    } else if (drink == 4) {
                        beverageType = "Ice Tea";
                        System.out.println("*** Ice Tea is chosen.");
                    } else if (drink == 5) {
                        beverageType = "GoldSpot";
                        System.out.println("*** GoldSpot is chosen.");
                    } else if (drink == 6) {
                        beverageType = "Sprite";
                        System.out.println("*** Sprite is chosen.");
                    } else {
                        break;
                    }
                }
                System.out.println("The selection of beverages is completed.");
                System.out.println("");

                Beverage_Order beverageOrder = new Beverage_Order(cook, beverageType);
                steward.fulfillOrder(beverageOrder);
            } else {
                System.out.println("-------------------------------------------------------------------------------");
                System.out.println("BON APPETIT");
                break;
            }
        }
    }
}
