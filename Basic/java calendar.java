import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    public static boolean isleap(int year){
        return (year%4==0 && year%100 !=0) || year%400==0;
    }
    public static boolean isValid(int month, int day, int year) {
    if (day < 1 || month < 1 || month > 12) {
        return false;
    }
    if (month == 1 || month == 3 || month == 5 || month == 7 ||
        month == 8 || month == 10 || month == 12) {
        return day <= 31;
    }
    else if (month == 4 || month == 6 || month == 9 || month == 11) {
        return day <= 30;
    }
    else if (month == 2) {
        if (isleap(year))
            return day <= 29;
        else
            return day <= 28;
    }
    return false;
}

    public static String findDay(int month, int day, int year) {
        String[] days = {"SUNDAY", "MONDAY", "TUESDAY","WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"};
        int t=0;
        int[] md={31,28,31,30,31,30,31,31,30,31,30,31};
        if(!isValid(month, day, year)){
            return "Not valid";
        }else{
            for(int i=1;i<year;i++){
                if(isleap(i)){
                    t+=366;
                }else{
                    t+=365;
                }
            }
            if(isleap(year)){
                md[1]=29;
            }
            for(int i=0;i<month-1;i++){
                t+=md[i];
            }
            t+=day;
            return days[t%7];
        }
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

/* method 2 using built in methods 
Calendar c= Calendar.getInstance();
        c.set(year, month-1,day);
        int d=c.get(Calendar.DAY_OF_WEEK)-1;
        String[] days = {
    "SUNDAY", "MONDAY", "TUESDAY",
    "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"
};
return days[d];*/

/* method 3 using formula
h = (q + floor(13(m + 1) / 5) + K
     + floor(K / 4) + floor(J / 4) + 5J) % 7
Zeller's formula
*/