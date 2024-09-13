/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personnages;


/**
 *
 * @author 200730946
 */
public class Mirmillon extends Personnage {
    String classe="Mirmillon";
    
    public Mirmillon(String nom, int attaqueMax, int defense, int pvs, int ini){
//        super.initiative=ini;
//        super.nom=nom;
//        super.pointsDeVie=pvs;
//        super.valeurDefense=defense;
//        super.valeurMaxAttaque=attaqueMax;
super(nom,attaqueMax,defense,pvs,ini);
    }

@Override
public void afficherInfosPersonnage() { 
        // TODO : Afficher les infos du personnage, tel que montré dans l'énoncé
        System.out.println("\n"+nom+"\n\tClasse : "+classe+"\n\tAttaque : "+valeurMaxAttaque+"\n\tDéfense : "+valeurDefense+"\n\tPoints de vie : "+pointsDeVie+"\n\tInitiative : "+initiative);
        
        if (pointsDeVie<=0) {
        System.out.println("\tStatut: Mort");
        }
        else {
          System.out.println("\tStatut: Vivant");    
        }
            
        }
    
@Override
public void setNewInitiativeRandom() {
        // TODO : Modifier de façon aléatoire la valeur INI du personnage.
        
        this.initiative=(int)(Math.random()*(31));
    }
@Override
public void frapperPersonnage(Personnage personnageCible) {
        super.frapperPersonnage(personnageCible);
        if (personnageCible.pointsDeVie==0) {
            System.out.println("\nBob décapite son adversaire!");
           }
        else{
            System.out.println("\nBob attaque à nouveau!");
            super.frapperPersonnage(personnageCible);
        }
        
    }
}