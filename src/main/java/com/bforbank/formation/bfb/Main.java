package com.bforbank.formation.bfb;

/**
 * Classe mère de l'application
 *
 * @author jntakpe
 */
public class Main {

    public static void main(String[] args) throws Exception {
        SuperThread st = new SuperThread();
        st.start();
        Thread.sleep(10);
        st.stop = true;
        System.out.println("Fin du programme");
    }

}
