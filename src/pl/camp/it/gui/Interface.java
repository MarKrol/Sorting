package pl.camp.it.gui;

import pl.camp.it.db.Data;
import pl.camp.it.sort.Sort;

import java.util.Scanner;

public class Interface {

    private static void showMainMenu(){
        System.out.println("\n"+"----------------- MENU -----------------");
        System.out.println("1. Losuj zestaw liczb do posortowania");
        System.out.println("2. Wyświetl wylosowany zestaw liczb");
        System.out.println("3. Wyświetl posortowany zestaw liczb");
        System.out.println("4. Wyjście z programu");
        System.out.print("----------------------------------------"+"\n");
        System.out.print("Twój wybór to: ");
    }

    public static void optionSelected(){

        showMainMenu();

        switch(scanChar()){
            case "1":
                Data.generate();
                break;
            case "2":
                Data.showDataTable();
                break;
            case "3":
                Sort.showDataTableSort();
                break;
            case "4":
                System.out.println("\n"+"Zakończono działanie programu!!!");
                System.exit(0);
                break;
            default:
                System.out.println("\n"+"Wprowadzono błędną wartość!!! Dokonaj poprawnego wyboru jeszcze raz!!!");
                break;
        }

        optionSelected();

    }

    private static String scanChar(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

}
