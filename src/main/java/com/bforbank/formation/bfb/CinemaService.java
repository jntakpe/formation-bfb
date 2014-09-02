package com.bforbank.formation.bfb;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * Publication des services relatifs aux {@link com.bforbank.formation.bfb.Cinema}
 *
 * @author jntakpe
 */
public interface CinemaService {

    /**
     * Lit le fichier CSV contenant les cinémas français
     *
     * @return la liste des cinémas français
     */
    List<Cinema> readCinemaFile() throws IOException;

    /**
     * Récupère les noms des cinémas d'une région
     *
     * @param cinemas liste des cinémas
     * @param region  région
     * @return liste des noms des cinémas
     */
    List<String> getCinenaNameByRegion(List<Cinema> cinemas, String region);

    /**
     * *** Service bonus *** Calcule le nombre de cinemas pour toutes les régions
     *
     * @param cinemas liste des cinémas
     * @return une map en clé le nom de la région et en valeur le nombre de cinémas de cette région
     */
    Map<String, Long> countCinemaByRegion(List<Cinema> cinemas);
}
