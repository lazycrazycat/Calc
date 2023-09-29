package q;

public class Calculator {

    //double result;
    public double calc (double a, double b, char sign){

        switch (sign){
            case ('+'):
                return a+b;
            case ('-'):
                return a-b;
            case ('*'):
                return a*b;
            case ('/'):
                if (b!=0){
                    return a/b;
                }
                else {
                    throw new ArithmeticException("Делить на 0 нельзя");
                }
            default:
                return Double.parseDouble(null);
        }
    }
}