/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetvin2;

/**
 *
 * @author dadou
 */
public class Vin {
    
    
    private String nomVin;
    private int millesimeVin;
    private Cepage leCepage;
    private Couleur laCouleur;
    private double prixduVin;

    public Vin(String nomVin, int millesimeVin, Cepage leCepage, Couleur laCouleur, double prixduVin) {
        this.nomVin = nomVin;
        this.millesimeVin = millesimeVin;
        this.leCepage = leCepage;
        this.laCouleur = laCouleur;
        this.prixduVin = prixduVin;
    }

    public String getNomVin() {
        return nomVin;
    }

    public void setNomVin(String nomVin) {
        this.nomVin = nomVin;
    }

    public int getMillesimeVin() {
        return millesimeVin;
    }

    public void setMillesimeVin(int millesimeVin) {
        this.millesimeVin = millesimeVin;
    }

    public Cepage getLeCepage() {
        return leCepage;
    }

    public void setLeCepage(Cepage leCepage) {
        this.leCepage = leCepage;
    }

    public Couleur getLaCouleur() {
        return laCouleur;
    }

    public void setLaCouleur(Couleur laCouleur) {
        this.laCouleur = laCouleur;
    }

    public double getPrixduVin() {
        return prixduVin;
    }

    public void setPrixduVin(double prixduVin) {
        this.prixduVin = prixduVin;
    }
  
    
    
    
}
