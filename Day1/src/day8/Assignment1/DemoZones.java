package day8.Assignment1;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class DemoZones {
    public static void main(String[] args) {
        Set<String> zoneids = ZoneId.getAvailableZoneIds();
        System.out.println(zoneids);

        LocalDateTime indialocal = LocalDateTime.now();
        System.out.println(indialocal);

        ZonedDateTime lst = indialocal.atZone(ZoneId.of("Asia/Calcutta"));
        System.out.println(lst);

        Instant instant = lst.toInstant();
        ZonedDateTime la = instant.atZone(ZoneId.of("America/Los_Angeles"));
        System.out.println(la.toLocalDateTime());
    }
}
