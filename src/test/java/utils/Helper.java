package utils;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Helper {


    private Helper(){}


    public static int getNumberFromString(String value){
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(value);
        ArrayList<String> words = new ArrayList<>();
        while (matcher.find()){
            words.add(matcher.group());
        }
        return Integer.parseInt(words.get(0));
    }
}
