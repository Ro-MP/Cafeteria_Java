package ui;

import java.time.Clock;
import java.time.Duration;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Hora {

    static ZoneId zoneId = ZoneId.systemDefault();
    static Clock clock = Clock.systemDefaultZone();



    public static String getHoraActual(){
        ZonedDateTime hora = clock.instant().atZone(zoneId);
        return "Hora actual: " + hora.getHour() + " hrs " + hora.getMinute() + " minutos";
    }

    public static String getHoraEstimada(int duracionDePreparacion){
        ZonedDateTime hora = clock.instant().atZone(zoneId);
        hora = hora.plusMinutes(duracionDePreparacion);
        return "Hora actual: " + hora.getHour() + " hrs " + hora.getMinute() + " minutos";
    }

}
