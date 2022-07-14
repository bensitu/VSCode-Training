package Java.Java0714.Question2;

public class AlarmClock extends Clock {
    String alarmTime;

    public AlarmClock(String time) {
        super(time);
    }

    public void setAlarm(String time) {
        this.alarmTime = time;
    }

    public void alarm() {
        if (this.alarmTime == time) {
            System.out.println("アラームが鳴りました。");
        }
    }
}
