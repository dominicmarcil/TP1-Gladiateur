package personnages;
import java.util.Random;
public class Personnage {

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Attributs">
    // TODO : Mettre vos attributs ici
    // </editor-fold>
    public String nom;
    public int pointsDeVie;
    public int valeurMaxAttaque;
    public int valeurDefense;
    public int initiative;
    
    
    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Constructeurs et initialisation">
    public Personnage(String nom, int attaqueMax, int defense, int pvs, int ini) {
        // TODO : Constructeur AVEC param�tres
        this.nom=nom;
        this.initiative=ini;
        this.pointsDeVie=pvs;
        this.valeurDefense=defense;
        this.valeurMaxAttaque=attaqueMax;
    }
    
    public Personnage() {
        // TODO : Constructeur SANS param�tres qui initialise � Z�RO ou � ""
        this.nom="";
        this.initiative=0;
        this.pointsDeVie=0;
        this.valeurDefense=0;
        this.valeurMaxAttaque=0;
    }
    // </editor-fold>

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Getters et setters">
    
    

    public String getNom() {
        return nom;
    }

    public int getPointsDeVie() {
        return pointsDeVie;
    }

    public int getValeurMaxAttaque() {
        return valeurMaxAttaque;
    }

    public int getValeurDefense() {
        return valeurDefense;
    }

    public int getInitiative() {
        return initiative;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPointsDeVie(int pointsDeVie) {
        this.pointsDeVie = pointsDeVie;
    }

    public void setValeurMaxAttaque(int valeurMaxAttaque) {
        this.valeurMaxAttaque = valeurMaxAttaque;
    }

    public void setValeurDefense(int valeurDefense) {
        this.valeurDefense = valeurDefense;
    }

    public void setInitiative(int initiative) {
        this.initiative = initiative;
    }
    
    // </editor-fold>
    
    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="M�canique de jeu">
    public void afficherInfosPersonnage() {
        // TODO : Afficher les infos du personnage, tel que montr� dans l'�nonc�
        System.out.println("\n"+nom+"\n\tAttaque : "+valeurMaxAttaque+"\n\tD�fense : "+valeurDefense+"\n\tPoints de vie : "+pointsDeVie+"\n\tInitiative : "+initiative);
        if (pointsDeVie<=0) {
        System.out.println("\tStatut: Mort");
        }
        else {
          System.out.println("\tStatut: Vivant");    
        }
            
        }
    
    

    private int attaqueCalcul() {
        // TODO : Retourner la valeur de l'attaque du personnage.
        // Cette valeur est trouv�e al�atoirement et doit se situer entre Z�RO et valeurMaxAttaque.
        Random rand= new Random();
        int attaque;
        attaque=rand.nextInt(valeurMaxAttaque - 0)+1;
        return attaque;
    }

    public void frapperPersonnage(Personnage personnageCible) {
        // TODO : R�cup�rer la valeur d'attaque pour ce tour, calculer les d�gats,
        int dommage=0;
        int forceDeFrappe= attaqueCalcul();
        
        dommage= forceDeFrappe-personnageCible.valeurDefense;
        if (dommage<0) {
            dommage=0;
        }
        personnageCible.pointsDeVie=personnageCible.pointsDeVie-dommage;
        if (personnageCible.pointsDeVie<0) {
            personnageCible.pointsDeVie=0;
        }
        System.out.println("\n"+this.nom+" attaque avec une puissance de : "+forceDeFrappe+"\n"+personnageCible.nom+" a une defense de : "+personnageCible.valeurDefense);
        System.out.println("\tLes dommages sont donc de : "+dommage);
        //modifier les points de vie du personnage cible, afficher les d�tails
        // sur l'attaque, tel que montr� dans l'�nonc�.
    }

    public void setNewInitiativeRandom() {
        // TODO : Modifier de fa�on al�atoire la valeur INI du personnage.
        this.initiative=(int)(Math.random()*101);
    }
    // </editor-fold>
}
