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
public class Bouteille {
    
    private int idBouteille;
    private int quantiteBouteille;
    private Vin leVin;
    
    
    public Bouteille(int idBouteille, int quantiteBouteille, Vin unVin)
    {
        this.idBouteille = idBouteille;
        this.quantiteBouteille = quantiteBouteille;
        this.leVin = unVin;
    }

    public int getIdBouteille() {
        return idBouteille;
    }

    public void setIdBouteille(int idBouteille) {
        this.idBouteille = idBouteille;
    }

    public int getQuantiteBouteille() {
        return quantiteBouteille;
    }

    public void setQuantiteBouteille(int quantiteBouteille) {
        this.quantiteBouteille = quantiteBouteille;
    }

    public Vin getLeVin() {
        return leVin;
    }

    public void setLeVin(Vin leVin) {
        this.leVin = leVin;
    }
    
}

