/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package superdidou.modele;

/**
 *
 * @author Malek
 */
public class Niveau {
    private int iNiveau;
    
    public Niveau(int iNiveau){
        this.iNiveau = iNiveau;
    }
    
    public int get(){
        return iNiveau;
    }
    
    public String toString(){
        return ""+iNiveau;
    }
    
}
