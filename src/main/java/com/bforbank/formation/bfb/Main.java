package com.bforbank.formation.bfb;

import java.io.IOException;
import java.util.List;

/**
 * Classe mère de l'application
 *
 * @author jntakpe
 */
public class Main {

    public static void main(String[] args) throws IOException {
        CinemaService cinemaService = new CinemaServiceImpl();
    }

}
