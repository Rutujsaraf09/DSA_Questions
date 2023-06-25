package hackerank;

import java.io.*;


class Res {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

  public static String timeConversion(String s) {
    // Extract the hour, minutes, seconds, and AM/PM indicator from the input string
    int hour = Integer.parseInt(s.substring(0, 2));
    int minutes = Integer.parseInt(s.substring(3, 5));
    int seconds = Integer.parseInt(s.substring(6, 8));
    String period = s.substring(8);

    // Convert the hour based on the AM/PM indicator
    if (period.equals("AM") && hour == 12) {
        hour = 0; // Special case: 12:00:00AM is 00:00:00 in 24-hour format
    } else if (period.equals("PM") && hour != 12) {
        hour += 12; // Add 12 to the hour for PM times (except 12:00:00PM)
    }

    // Format the time in 24-hour format
    String formattedHour = String.format("%02d", hour);
    String formattedMinutes = String.format("%02d", minutes);
    String formattedSeconds = String.format("%02d", seconds);

    return formattedHour + ":" + formattedMinutes + ":" + formattedSeconds;
}


}

 class TimeConversion {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();
        String result = Res.timeConversion(s);

System.out.println(result);
        bufferedReader.close();
       
    }
}



