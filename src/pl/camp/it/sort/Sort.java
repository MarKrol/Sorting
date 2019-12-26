package pl.camp.it.sort;

import pl.camp.it.db.Data;

public class Sort {
    private static int[] datatablesort = new int[Data.sizeDataTable()];

    private static void copyTable(){
        for (int i=0; i< datatablesort.length; i++) {
            datatablesort[i] = Data.getDatatable(i);
        }
    }

    public static void showDataTableSort(){
        if(!Data.isEmptydatatable()){
            copyTable();
            showDataTableBeforeSort();
            sortTable();
        } else{
            System.out.println("\n"+"Brak zestawu liczb do sortowania!!! Wylosuj zestaw liczb do posortowania!!!");
        }
    }

    private static void showDataTableBeforeSort(){
        System.out.println();
        System.out.print("Nieposortowany zestaw liczb: ");
        for(int dts: datatablesort){
            System.out.print(dts + ", ");
        }
        System.out.println();
    }

    private static void showDataTableAfterSort(){
        System.out.println();
        System.out.print("Posortowany zestaw liczb: ");
        for(int dts: datatablesort){
            System.out.print(dts + ", ");
        }
        System.out.println();
    }

    private static void sortTable(){
        int number;

        if (!isSortTab()) {
            for (int i = 0; i < datatablesort.length - 1; i++) {
                if (!isSortTab()) {
                    for (int k = i + 1; k < datatablesort.length; k++) {
                        if (datatablesort[i] < datatablesort[k]) {
                            number = datatablesort[i];
                            datatablesort[i] = datatablesort[k];
                            datatablesort[k] = number;
                        }
                    }
                }
            }
            showDataTableAfterSort();
        } else {
            System.out.println("\n"+ "Tablica na wejściu była posortowana!!! " +
                    "Powyższy zestaw liczb jest również posortowaną tablicą!!!"+"\n");
        }
    }

    private static boolean isSortTab(){
        boolean sort = false;
        for (int i=0; i <= datatablesort.length-2; i++){
            if (datatablesort[i]>=datatablesort[i+1]){
                sort = true;
            } else{
                sort = false;
                break;
            }
        }
        return sort;
    }

}
