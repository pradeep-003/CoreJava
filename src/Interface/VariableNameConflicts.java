package Interface;
interface Left

{

    int x=888;

}

interface Right

{

    int x =999;

}

class VariableNameConflicts implements Left,Right
{

    public static void main(String args[]){

      //  System.out.println(x);

       System.out.println(Left.x);

       System.out.println(Right.x);

    }

}
