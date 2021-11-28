import CoffeeMachine.CaffeList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {


    public static void main(String[] args) {

        CaffeList caffeList1 = new CaffeList();
        List<String> caffeList = new ArrayList<>();
        //String[] caffeList = new String[5];

        int coffeeBeans = 0;
        int water = 0;
        int milk = 0;

        //TODO americano = 150ml wody i 50 ziaren kawy
        caffeList.add("1.Americano");
        caffeList.add("2.Caffe late ");
        caffeList.add("3.Espresso");
        caffeList.add("4.Late machiato");

        boolean temp = true;


        Scanner scan = new Scanner(System.in);
        System.out.println("Wybierz napój");
        System.out.println("Jeśli nie chcesz dawaj 0 ");
        System.out.println("1.Americano");
        System.out.println("2.Caffe late");
        System.out.println("3.Espresso");
        System.out.println("4.Late machiato");
        do {


            int userChoice = scan.nextInt();

            switch (userChoice) {
                case 1 -> {
                    System.out.println("Wybrałeś Americano, czy chcesz dodać cukier ?");
                    System.out.println("Jeśli 1 dodasz cukier ");
                    System.out.println("Jeśli 2 nie dodasz cukier ");
                    int cukierChoice = scan.nextInt();
                    switch (cukierChoice) {
                        case 1 -> {
                            System.out.println("1.dodaj curkie");
                            break;

                        }
                        case 2 -> {
                            System.out.println("bez cukru");
                            break;
                        }
                    }
                    break;
                }
                case 2 -> {
                    System.out.println("Wybrałeś Caffe Late");
                    break;
                }
                case 3 -> {
                    System.out.println("Wybrałeś Espresso");
                    break;
                }
                case 4 -> {
                    System.out.println("Wybrałeś Late Machiato");
                    break;
                }
                case 0 -> {
                    System.out.println("exit");
                    temp = false;
                }
            }
//            System.out.println("Czy chcesz kawe?");
//
//            String coffeOrNot = scan.nextLine();
//
//            if(coffeOrNot == "yes"){
//                temp = true;
//
//            }else if(coffeOrNot == "no"){
//                temp = false;
//            }

        } while (temp == true);


    }
}