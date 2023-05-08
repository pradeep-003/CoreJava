package Polymorphism;
class Loan{

    public float getIR(){

        return 7.0f;

    }

}

class GoldLoan extends Loan{

    public float getIR(){

        return 10.5f;

    }

}

class StudyLoan extends Loan{

    public float getIR(){

        return 12.0f;

    }

}

class CraftLoan extends Loan{

}

class Test{

    public static void main(String[] args){

        Loan gold_Loan=new GoldLoan();

        System.out.println("Gold Loan IR :"+gold_Loan.getIR()+"%");


        Loan study_Loan=new StudyLoan();

        System.out.println("Study Loan IR :"+study_Loan.getIR()+"%");


        Loan craft_Loan=new CraftLoan();

        System.out.println("Craft Loan IR :"+craft_Loan.getIR()+"%");

    }

}
