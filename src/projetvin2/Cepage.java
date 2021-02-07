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
public class Cepage {
    
    private String nomduCepage;
    
    public Cepage( String unNomCepage)
    {
        this.nomduCepage = unNomCepage;
        
    }
    public String getnomduCepage()
            
            {
                return nomduCepage;
                
            }
            
    public void setnomduCepage(String unnomCepage)
    {
        
         this.nomduCepage = unnomCepage;
    }
    
    
}
