package ua.od.pindus;

public class Main {

    public static void main(String[] args) {
        AlarmClock clock = new AlarmClock();
        clock.setCurrentTime(18, 10, 0);
        clock.setAlarmTime(18, 10, 10);

        for (int i = 0; i < 25; i++) {
            clock.Clock();
            clock.fireAlarm();
            clock.printAlarm();
            if (clock.isSurprise()) {
                if(!(clock.minutes==clock.setMinutes&&clock.seconds==clock.setSeconds))
                {
                    System.out.println("You've overslept, looser.");
                }
                break;
            }
        }

        if (clock.isAlarmTime()) {
            clock.fireAlarm();
            return;
        }
    }
}
