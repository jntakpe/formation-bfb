package com.bforbank.formation.bfb;

/**
 * @author jntakpe
 */
public class SuperThread extends Thread {

    boolean stop = false;

    @Override
    public void run() {
        while (!stop) {
        }
        System.out.println("Le thread est terminé ...");
    }

}
