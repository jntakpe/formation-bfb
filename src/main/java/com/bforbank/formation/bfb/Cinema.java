package com.bforbank.formation.bfb;

/**
 * JavaBean représentant un cinéma
 *
 * @author jntakpe
 */
public class Cinema {

    private final String nom;

    private final String ville;

    private final String region;

    public Cinema(String nom, String ville, String region) {
        this.nom = nom;
        this.ville = ville;
        this.region = region;
    }

    public String getNom() {
        return nom;
    }

    public String getVille() {
        return ville;
    }

    public String getRegion() {
        return region;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cinema cinema = (Cinema) o;

        if (nom != null ? !nom.equals(cinema.nom) : cinema.nom != null) return false;
        if (ville != null ? !ville.equals(cinema.ville) : cinema.ville != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = nom != null ? nom.hashCode() : 0;
        result = 31 * result + (ville != null ? ville.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Cinema{" +
                "nom='" + nom + '\'' +
                ", ville='" + ville + '\'' +
                ", region='" + region + '\'' +
                '}';
    }
}
