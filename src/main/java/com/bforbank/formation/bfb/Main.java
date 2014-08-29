package com.bforbank.formation.bfb;

import java.time.*;
import java.time.temporal.ChronoUnit;

/**
 * Classe mère de l'application
 *
 * @author jntakpe
 */
public class Main {

    public static void main(String[] args) throws Exception {
        instant();
        period();
    }


    public static void instant() {
        Instant now = Instant.now();
        for (int i = 0; i < 10000; i++) {
            String toto = "toto" + i;
        }
        Instant end = Instant.now();
        Duration elapsed = Duration.between(now, end);
        System.out.println(elapsed.toMillis());
        elapsed = elapsed.plus(2L, ChronoUnit.SECONDS); //Mutable or immutable ?
        System.out.println(elapsed.toMillis());
    }

    public static void period() {
        LocalDate now = LocalDate.now();
        LocalDate lemonStart = LocalDate.of(2014, Month.MAY, 11);
        System.out.println("Jours depuis le début de Lemon : " + lemonStart.until(now, ChronoUnit.DAYS));
    }
}
