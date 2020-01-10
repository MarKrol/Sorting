package pl.camp.it.db;

import java.util.Random;

public class Data {
    private static final int size = 5;
    private static int[] datatable = new int[size];
    private static boolean emptydatatable = true;

    public static int sizeDataTable(){
        return datatable.length;
    }

    public static int getDatatable(int number) {
        return datatable[number];
    }

    public static boolean isEmptydatatable() {
        int count = 0;
        for (int i=0; i<size; i++) {
            if (datatable[i]==0) {
                count++;
            }
            if (count == size){
                setEmptydatatable(true);
            } else {
                setEmptydatatable(false);
            }
        }
        return emptydatatable;
    }

    public static void setEmptydatatable(boolean emptydatatable) {
        Data.emptydatatable = emptydatatable;
    }

    public static void generate(){
        Random random = new Random();
        //int[] datatable1 = {4, 8, 6,5,2};
        //Data.datatable = datatable1;

        for (int i=0; i<size; i++) {
            Data.datatable[i] = random.nextInt();
        }
        System.out.println("\n"+"Wylosowano zestaw liczb do posortowania!!!");
    }

    private static void dataTable(){
        System.out.print("\n"+"Wylosowany zestaw liczb: ");
        for (int i=0; i<size; i++){
            System.out.print(datatable[i]+", ");
        }
        System.out.println();
    }

    public static void showDataTable(){
        if (!isEmptydatatable()) {
            dataTable();
        } else {
            System.out.println("\n"+"Brak zestawu liczb do sortowania!!! Wylosuj zestaw liczb do posortowania!!!");
        }

    }
}
