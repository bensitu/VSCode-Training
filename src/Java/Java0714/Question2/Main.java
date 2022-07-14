package Java.Java0714.Question2;

public class Main {
    public static void main(String[] args) {
        Clock clock = new Clock("10:30");
        clock.showTime();

        AlarmClock alarmClock = new AlarmClock("14:30");
        alarmClock.showTime();
        alarmClock.setAlarm("14:00");
        alarmClock.alarm();
        alarmClock.setAlarm("14:30");
        alarmClock.alarm();
    }
}
