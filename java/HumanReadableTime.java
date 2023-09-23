import java.text.DecimalFormat;

public class HumanReadableTime {
    public String makeReadable(int seconds) {

        int minutes = 0;
        int hours = 0;

        if (seconds > 359999) {
            return "99:59:59";
        }

        while (seconds >= 60) {
            seconds = seconds - 60;
            minutes++;
        }

        while (minutes > 59) {
            minutes = minutes - 60;
            hours++;
        }

        while (hours > 99) {
            hours--;
        }

        DecimalFormat formato = new DecimalFormat("00");

        String horas = formato.format(hours);
        String minutos = formato.format(minutes);
        String segundos = formato.format(seconds);

        return horas + ":" + minutos + ":" + segundos;

    }
}
