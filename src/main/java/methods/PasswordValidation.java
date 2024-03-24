package methods;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidation {
    public static boolean isValidPassword(String pass) {
       //check password length
        if (pass.length() < 8) {
            return false;
        }
        //check letter, number, symbol presence => create Pattern object to set pattern criteria
        Pattern letterPattern = Pattern.compile("[a-zA-Z]");
        Pattern numberPattern = Pattern.compile("[0-9]");
        Pattern symbolPattern = Pattern.compile("[^a-zA-Z0-9]");

        //create Matcher object to search the pattern criteria in the string
        Matcher letterMatcher = letterPattern.matcher(pass);
        Matcher numberMatcher = numberPattern.matcher(pass);
        Matcher symbolMatcher = symbolPattern.matcher(pass);

        // check if the pattern is met/ = true & false
        boolean hasLetter = letterMatcher.find();
        boolean hasNumber = numberMatcher.find();
        boolean hasSymbol = symbolMatcher.find();

       return hasLetter && hasNumber && hasSymbol;
    }
    public static boolean arePositiveAndEqual(int num1, int num2, int num3){
        if((num1 >0 && num2>0 && num3>0) && (num1 == num2) && (num2 == num3)){
            return true;
        }
        else{
            return false;
        }
    }
    public static double returnAverage(double num1,double num2){
        return(num1+num2)/2;
    }
    public static double returnSum(double num1, double num2){
        return num1+num2;
    }
}