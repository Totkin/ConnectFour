package ConnectFour;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Board {

    ArrayList<String> columna;
    ArrayList<ArrayList<String>> filas;

    public Board() {
        columna = new ArrayList<>( Arrays.asList("1","0","0","0","0","0","0"));
        filas = new ArrayList<>( Arrays.asList(columna,columna,columna,columna,columna,columna));
        isColumnFull(2,"R");
    }

    public void isColumnFull(int column,String color) {
        if (filas.get(column).size()<=100) {
        insertToken(column,color);
        }else {
            System.out.println("ya no cabe mas");
        }
    }

    private void insertToken(int column,String color) {
        filas.get(column).add(color);
    }

    public void paint() {
        for (ArrayList<String> d : filas) {
            System.out.println(d);
        }
    }

    public void paintBoard() {

        for (int row = 0; row < filas.get(0).size(); row++){
            System.out.print("|");
            for (int col = 0; col <= 1+filas.size(); col++){
                System.out.print(filas.get(row).get(col));
                System.out.print("|");
            }
            System.out.println();

        }
        System.out.println(" 0 1 2 3 4 5 6");
        System.out.println();

    }

} 
