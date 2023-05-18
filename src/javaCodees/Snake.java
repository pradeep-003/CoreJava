package javaCodees;

import java.util.ArrayList;

public class Snake {

    static String direction = "Right" ; // UP, RIGHT, DOWN, LEFT
    private int tableRows = 15 ;
    private int tableColumns = 50 ;
    private String tableData [][] = new String[tableRows][tableColumns];
    private int fruit [] = new int[2];

    private ArrayList<int[]> playerData = new ArrayList<int[]>();
    public static void main(String[] args) {

        Snake snake = new Snake();

        snake.start();
    }

    // controls native method to call c++ function
    static native void controls();

    public static void controlUp(){

    }
    public static void controlRight(){

    }
    public static void controlDown(){

    }
    public static void controlLeft(){

    }

    public void start(){

    }
}
