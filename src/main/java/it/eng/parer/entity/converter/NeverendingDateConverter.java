package it.eng.parer.entity.converter;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.util.Date;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NeverendingDateConverter {

    private static final Logger LOG = LoggerFactory.getLogger(NeverendingDateConverter.class);

    /*
     * MAX DATE supported by Oracle DB
     * 
     * https://www.techonthenet.com/oracle/datatypes.php
     */
    public static final LocalDateTime NEVERENDING = LocalDateTime.of(9999, Month.DECEMBER, 31, 23, 59, 59);

    /**
     * Verifica se una certa data (ZoneId di sistema) convertita con lo zoneIdToCheck se oltre la data massima permessa
     * NEVERENDING altrimenti restituisce NEVERENDING
     *
     * @param dateToCheck
     *            data da verificare
     * @param zoneIdToCheck
     *            id Locale
     * 
     * @return date
     */
    public static Date verifyOverZoneId(Date dateToCheck, ZoneId zoneIdToCheck) {
        // equals OR after
        Date dateToCheckOverZid = convert(dateToCheck, zoneIdToCheck);
        if (dateToCheckOverZid.equals(asDate(NEVERENDING)) || dateToCheckOverZid.after(asDate(NEVERENDING))) {
            LOG.warn("Data: " + dateToCheck + " oltre il limite massimo consentito " + NEVERENDING);
            return asDate(NEVERENDING);
        }
        return dateToCheck;
    }

    /**
     * Come sopra ma con il default ZoneId
     *
     * @param dateToCheck
     *            da verificare
     * 
     * @return date da verificare
     */
    public static Date verifyOverZoneId(Date dateToCheck) {
        return verifyOverZoneId(dateToCheck, ZoneId.systemDefault());
    }

    private static Date convert(Date dateToCheck, ZoneId zid) {
        return asDate(asLocalDateTime(dateToCheck, zid));
    }

    private static Date asDate(LocalDateTime localDateTime) {
        return asDate(localDateTime, ZoneId.systemDefault());
    }

    private static Date asDate(LocalDateTime localDateTime, ZoneId zid) {
        return Date.from(localDateTime.atZone(zid).toInstant());
    }

    private static LocalDate asLocalDate(Date date) {
        return Instant.ofEpochMilli(date.getTime()).atZone(ZoneId.systemDefault()).toLocalDate();
    }

    private static LocalDateTime asLocalDateTime(Date date) {
        return asLocalDateTime(date, ZoneId.systemDefault());
    }

    private static LocalDateTime asLocalDateTime(Date date, ZoneId zid) {
        return Instant.ofEpochMilli(date.getTime()).atZone(zid).toLocalDateTime();
    }
}
