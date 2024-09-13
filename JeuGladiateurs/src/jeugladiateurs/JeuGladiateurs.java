package jeugladiateurs;

import personnages.Personnage;
import combat.CompteurDeTour;
import combat.AffichageEcran;
import personnages.Mirmillon;

public class JeuGladiateurs {

    public static void main(String[] args) {

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="expanded" desc="Instanciation des objets">
    CompteurDeTour tour = new CompteurDeTour();
    AffichageEcran affichage = new AffichageEcran();
    Personnage Bob = new Mirmillon("Bob le malchanceux",15,15,70,15);
    Personnage Igor = new Personnage("Igor l'empaleur",25,5,100,30);
    // </editor-fold>

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Affichage pré-combat">
    // TODO : Afficher les infos de chaque personnage
    Bob.afficherInfosPersonnage();
    Igor.afficherInfosPersonnage();
    // TODO : Afficher le message du début du combat
    affichage.afficherDebutCombat();
    Bob.setNewInitiativeRandom();
    Igor.setNewInitiativeRandom();
        while (Bob.pointsDeVie>0 && Igor.pointsDeVie>0){
            tour.afficheTour();
            for (int i = 0; i < 100; i++) {
                if (Bob.initiative==i) {
                    Bob.frapperPersonnage(Igor);
                    if (Igor.pointsDeVie==0) {
                     System.out.println("\nBob décapite son adversaire!");
                    }
                    else{
                        System.out.println("\nBob attaque à nouveau!");
                        Bob.frapperPersonnage(Igor);
                    }
                    
                }
                if (Igor.initiative==i) {
                    Igor.frapperPersonnage(Bob);
                }
            }
            affichage.afficherSeparateurInfosPerso();
            Bob.afficherInfosPersonnage();
            Igor.afficherInfosPersonnage();
            Bob.setNewInitiativeRandom();
            Igor.setNewInitiativeRandom();
            tour.augmenteTour();
            affichage.afficherSeparateurDeTour();
        }
        affichage.afficheVictoire(Bob, Igor);

    
    
    // </editor-fold>

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Mécanique de combat">
    // TODO : La boucle contenant les étapes du combat
    // TODO : Après la boucle, afficher le résultat du combat
    // </editor-fold>
    }

}
