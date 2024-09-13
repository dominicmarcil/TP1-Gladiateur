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
    // <editor-fold defaultstate="collapsed" desc="Affichage pr�-combat">
    // TODO : Afficher les infos de chaque personnage
    Bob.afficherInfosPersonnage();
    Igor.afficherInfosPersonnage();
    // TODO : Afficher le message du d�but du combat
    affichage.afficherDebutCombat();
    Bob.setNewInitiativeRandom();
    Igor.setNewInitiativeRandom();
        while (Bob.pointsDeVie>0 && Igor.pointsDeVie>0){
            tour.afficheTour();
            for (int i = 0; i < 100; i++) {
                if (Bob.initiative==i) {
                    Bob.frapperPersonnage(Igor);
                    if (Igor.pointsDeVie==0) {
                     System.out.println("\nBob d�capite son adversaire!");
                    }
                    else{
                        System.out.println("\nBob attaque � nouveau!");
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
    // <editor-fold defaultstate="collapsed" desc="M�canique de combat">
    // TODO : La boucle contenant les �tapes du combat
    // TODO : Apr�s la boucle, afficher le r�sultat du combat
    // </editor-fold>
    }

}
