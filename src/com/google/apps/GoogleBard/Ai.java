package com.google.apps.GoogleBard;


class Ai {
    public static void main(String[] args) {
        try {
            System.out.println(8/0);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Systumm....");
        }
    }
}
