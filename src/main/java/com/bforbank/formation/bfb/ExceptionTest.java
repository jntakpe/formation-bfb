package com.bforbank.formation.bfb;

import java.io.IOException;

/**
 * @author ntakpe_j
 */
public interface ExceptionTest {

    /**
     * Lit la ligne du fichier test.txt
     *
     * @return valeur de la ligne
     * @throws IOException lorsqu'une errreur survient lors de la lecture du fichier
     */
    String readFileLine() throws IOException;

    /**
     * Transforme le string en integer
     *
     * @param ligne valeur de la ligne du fichier test
     * @return ligne transformé en int
     * @throws NumberFormatException lorsque la chaine parsée n'est pas un nombre
     */
    Integer parseLine(String ligne) throws NumberFormatException;


}
