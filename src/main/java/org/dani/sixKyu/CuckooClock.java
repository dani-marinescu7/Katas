package org.dani.sixKyu;

public class CuckooClock {

    public static void main(String[] args) {
        System.out.println(cuckooClock("03:38", 19));;
    }

    public static String cuckooClock(String inputTime, int chimes) {
        String[] splitTime = inputTime.split(":");
        int currentHour = Integer.parseInt(splitTime[0]);
        int currentMinute = Integer.parseInt(splitTime[1]);
        int totalChimes = calculateChimes(currentHour, currentMinute);
        int remainingChimes = chimes - totalChimes;

        while (remainingChimes > 0) {
            currentHour = (currentHour % 12) + 1;
            totalChimes += calculateChimes(currentHour, 0);
            remainingChimes = chimes - totalChimes;
        }

        int remainingMinutes = remainingChimes * 15;
        currentMinute += remainingMinutes;

        return String.format("%02d:%02d", currentHour, currentMinute);
    }

    private static int calculateChimes(int hour, int minute) {
        int chimes = 0;

        if (minute >= 45) {
            chimes += 1;
        }
        if (minute % 30 == 0) {
            chimes += 2;
        }
        if (minute % 15 == 0) {
            chimes += 1;
        }
        if (minute == 0) {
            chimes += hour;
        }

        return chimes;
    }
}
