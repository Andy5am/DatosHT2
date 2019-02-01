public class MyCalculator implements Calculator {
    public int calculate(int num1, int num2, String op){
    //devuelve el resultado de la operacion qe el susuario desea.
        if(op.equals("+")){
            return num1 + num2;
        }else if(op.equals("-")){
            return num1 - num2;
        }else if(op.equals("*")){
            return num1 * num2;
        }else {
            return num1/num2;
        }
    }
}
