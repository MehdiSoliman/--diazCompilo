/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package superdidou.modele;

/**
 *
 * @author Malek
 */
public abstract class Question implements IQuestion{
    private Reponse iReponse;
    private Niveau iNiveau;
    private Chapitre iChapitre;
    
    public Question(Niveau iNiveau, Chapitre iChapitre,Reponse iReponse){
        this.iChapitre = iChapitre;
        this.iNiveau = iNiveau;
        this.iReponse = iReponse;
    }
    
    public Reponse getReponse(){
        return iReponse;
    }
    
    public Chapitre getChapire(){
        return iChapitre;
    }
    
    public Niveau getNiveau(){
        return iNiveau;
    }
    
    
}
