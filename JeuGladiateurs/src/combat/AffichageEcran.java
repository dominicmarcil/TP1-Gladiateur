package combat;

import personnages.Personnage;

public class AffichageEcran {

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="M�thodes d'affichage">
    public void afficherDebutCombat() {
        // TODO : Afficher le message du d�but du combat, tel que montr� dans l'�nonc�
        System.out.println("\n<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<\n>>>>>> Que le combat commence !>>>>>\n<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<\n");
    }
    
    public void afficherSeparateurDeTour() {
        // TODO : Afficher un retour � la ligne, suivi d'une ligne d'ast�risques, tel que montr� dans l'�nonc�
        System.out.println("\n*************************************************");
    }

    public void afficherSeparateurInfosPerso() {
        // TODO : Afficher un retour � la ligne, suivi du s�parateur "infos personnages", tel que montr� dans l'�nonc�
        System.out.println("\n-----------------\nINFO PERSONNAGES\n-----------------");
    }

    public void afficheVictoire(Personnage personnage1, Personnage personnage2) {
        // TODO : Afficher le gagnant du combat, tel que montr� dans l'�nonc�
        if (personnage1.pointsDeVie>0) {
            System.out.println("\n"+personnage1.nom+" gagne le combat !!!");
        }
        if (personnage2.pointsDeVie>0) {
            System.out.println("\n"+personnage2.nom+" gagne le combat !!!");
        }
    }
    // </editor-fold>
}
