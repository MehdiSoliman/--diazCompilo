/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package superdidou.modele;

import java.util.ArrayList;

/**
 *
 * @author Malek
 */
public class Questionnaire {
    private ArrayList<Question> iQuestionnaire;
    
    public Questionnaire(){
        iQuestionnaire = new ArrayList<Question>();
    }
    
    public boolean addQuestion(Question iQuestion){
        iQuestionnaire.add(iQuestion);
        return false;
    }
    
    public void initQuestionnaire(Chapitre iChapitre,Niveau iNiveau){
        
    }
    
    
    
}
