package ua.od.pindus;
import java.util.Random;

/**
 * Created by User on 21.04.2016.
 */
public class AlarmClock {
    String name;
    int hours;
    int minutes;
    int seconds;
    int setHours;
    int setMinutes;
    int setSeconds;

    public void setCurrentTime(int hours, int minutes, int seconds) {
        if (hours > 60 || minutes > 60 || seconds > 60)
            System.out.println("Wrong data!");
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public void setAlarmTime(int hours, int minutes, int seconds) {
        setHours = hours;
        setMinutes = minutes;
        setSeconds = seconds;
    }

    public void Clock() {
        seconds++;
        if (seconds == 60) {
            minutes++;
            seconds = 0;
            if (minutes == 60) {
                minutes = 0;
                hours++;
            }
        }
    }

    public void fireAlarm() {
        if (isAlarmTime())
            System.out.println("ALARM! WAAAKE UUP");
    }

    public boolean isAlarmTime() {
        if (hours == setHours && minutes == setMinutes && seconds == setSeconds)
            return true;
        else
            return false;
    }

    public boolean isSurprise(){
        Random rnd=new Random();
        int time=rnd.nextInt(10);
        if(time==seconds){
            System.out.println("Oops. Alarm has broken.");
            setToZero();
            return true;
        }
        else return false;
    }
    void setToZero(){
        hours = 0;
        minutes = 0;
        seconds = 0;
    }
    public void printAlarm() {
        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}
