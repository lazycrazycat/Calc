package q;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pars {

    public int[] getNumbers (String str){

        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(str);

        int[] numbers = new int[3];
        int i = 0;

        while (matcher.find()) {
            numbers[i] = Integer.parseInt(matcher.group());
            i++;
        }
        return numbers;
    }
    public char[] getSigns (String str){
        str = str.replaceAll("[0-9]+", "");
        //System.out.println(str);
        char[] signs = str.toCharArray();
        return signs;
    }
}