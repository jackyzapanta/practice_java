public class SecondsandMinutes {

    public static void main(String[] args) {
        System.out.println(getDurationString(9020));
    }

    public  static String getDurationString(int seconds) {
        String message = "Invalid input";
        if (seconds >= 0) {

            int min = seconds / 60;
            message = getDurationString(min, seconds);
        }
        return message;
    }

    public  static String getDurationString(int minutes, int seconds) {
        String message = "Invalid input";
        if (minutes >= 0 && seconds >=0) {
            int hrs = minutes / 60;
            int min = minutes % 60;
            int sec = seconds % 60;
            message = hrs + "h " + min + "m " + sec + "s ";
        }
        return message;
    }
}
