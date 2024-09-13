/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personnages;

/**
 *
 * @author 200730946
 */
public class Rétiaire extends Personnage {

    String classe = "Rétiaire";
    boolean filet = true;

    public Rétiaire() {
    }

    public Rétiaire(String nom, int attaqueMax, int defense, int pvs, int ini) {

        super(nom, attaqueMax, defense, pvs, ini);
    }

    @Override
    public void afficherInfosPersonnage() {
        // TODO : Afficher les infos du personnage, tel que montré dans l'énoncé
        System.out.println("\n" + nom + "\n\tClasse : " + classe + "\n\tAttaque : " + valeurMaxAttaque + "\n\tDéfense : " + valeurDefense + "\n\tPoints de vie : " + pointsDeVie + "\n\tInitiative : " + initiative);

        if (pointsDeVie <= 0) {
            System.out.println("\tStatut: Mort");
        } else {
            System.out.println("\tStatut: Vivant");
        }

    }

    @Override
    public void frapperPersonnage(Personnage personnageCible) {
        if (filet == true) {
            System.out.println("\nIgor lance son filet.....");
            int random = (int) (Math.random() * 11);
            if (random == 10) {
                System.out.println("\nSon filet attrape Bob le malchanceux et il l'empale sauvagement!");
                personnageCible.pointsDeVie = 0;
            } else {
                System.out.println("\nSon filet n'atteint pas la cible.");
                filet = false;
            }
        } else {
            System.out.println("\nIgor l'empaleur ramasse son filet et en profite pour attaquer!");
            super.frapperPersonnage(personnageCible);
            filet = true;
        }

    }

}
