package q;
import javax.lang.model.type.NullType;
import java.util.Scanner;
public class Logic {
    public void logicCalc(){

        System.out.println("Input: ");
        String str = String.valueOf(inParameter());

        int[] numbers = new Pars().getNumbers(str);

        for(int i = 0; i < 2; i++) {
            if (numbers[i]>10){
                throw new RuntimeException("В выражении число больше 10");
            }
        }
        char[] signs = new Pars().getSigns(str);
        char firstChar = str.charAt(0);

        Integer a;

        if (firstChar == '-'){
            a = numbers[0]*(-1);
        }
        else {
            a = numbers[0];
        }

        Integer b = numbers[1];
        Integer c = numbers[2];
        double result_;
        double result;

        if (c != null){
            if (firstChar != '-'){
                if ((signs[1] == '*' &&  signs[1] == '/') && (signs[0] == '+' && signs[0] == '-') ){
                    result_ = new Calculator().calc(b,c,signs[1]);
                    result = new Calculator().calc(a,result_,signs[0]);
                }
                else {
                    result_ = new Calculator().calc(a,b,signs[0]);
                    result = new Calculator().calc(result_,c,signs[1]);
                }
            }
            else{
                if ((signs[2] == '*' && signs[2] == '/') && (signs[1] == '+' && signs[1] == '-') ){
                    result_ = new Calculator().calc(b,c,signs[2]);
                    result = new Calculator().calc(a,result_,signs[1]);
                }
                else {
                    result_ = new Calculator().calc(a,b,signs[1]);
                    result = new Calculator().calc(result_,c,signs[2]);
                }
            }
        }
        else {
            if (firstChar != '-'){
                result = new Calculator().calc(a,b,signs[0]);
            }
            else {
                result = new Calculator().calc(a,b,signs[1]);
            }
        }
        System.out.println(("Output: \n ") + result);
    }
    private String inParameter(){
        Scanner sc = new Scanner(System.in);
        return sc.next();
    }
}