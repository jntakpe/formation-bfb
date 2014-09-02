package com.bforbank.formation.bfb;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;

/**
 * Implémentation des services associés aux cinémas
 *
 * @author jntakpe
 * @see com.bforbank.formation.bfb.CinemaService
 */
public class CinemaServiceImpl implements CinemaService {

    private static final Path CINEMA_FILE_PATH = Paths.get("src", "main", "resources", "cinemas.csv");

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Cinema> readCinemaFile() throws IOException {
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<String> getCinenaNameByRegion(List<Cinema> cinemas, String region) {
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Map<String, Long> countCinemaByRegion(List<Cinema> cinemas) {
        return null;
    }
}
