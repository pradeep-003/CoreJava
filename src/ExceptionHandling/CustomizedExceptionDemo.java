package ExceptionHandling;

import java.util.Scanner;

class TooYoungException extends RuntimeException{

    TooYoungException(String s){

        super(s);

    }

}

class TooOldException extends RuntimeException{

    TooOldException(String s){

        super(s);

    }

}


public class CustomizedExceptionDemo{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int age= sc.nextInt();

        if(age>60){

            throw new TooOldException("please wait some more time.... u will get best match");

        }

        else if(age<18){

            throw new TooYoungException("u r age already crossed....no chance of getting married");

        }

        else{

            System.out.println("you will get match details soon by email");

        }

    }

}
