package org.dani.sixKyu;

public class CuckooClock {

    public static void main(String[] args) {
        System.out.println(cuckooClock("03:38", 19));
    }

    public static String cuckooClock(String inputTime, int chimes) {
        String[] splitTime = inputTime.split(":");
        int hour = Integer.parseInt(splitTime[0]);
        int minutes = Integer.parseInt(splitTime[1]);

        while (chimes > 0) {
            if (minutes >= 45) {
                chimes -= 1;
                minutes = 0;
                hour += 1;
            } else if (minutes >= 30) {
                chimes -= 1;
                minutes = 45;
            } else if (minutes >= 15) {
                chimes -= 1;
                minutes = 30;
            } else if (minutes > 0) {
                chimes -= 1;
                minutes = 15;
            } else if (minutes == 0) {
                chimes -= 4;
                minutes = 15;
            }
        }

        return String.format("%02d:%02d", hour, minutes);
    }
}
