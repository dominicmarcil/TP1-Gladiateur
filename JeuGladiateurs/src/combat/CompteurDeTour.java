package combat;

public class CompteurDeTour {

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Attributs">
    // TODO : Mettre vos attributs ici
    public int cptrTour;
    // </editor-fold>

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Constructeurs et initialisation">
    public CompteurDeTour() {
        // TODO : Constructeur SANS paramètres qui initialise un compteur de tour (attribut) à 1
        this.cptrTour = 1;
    }
    // </editor-fold>

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Getters et setters">
    // TODO : Le getter
    public int getCptrTour() {
        return cptrTour;
    }

    // TODO : Le setter
    public void setCptrTour(int cptrTour) {
        this.cptrTour = cptrTour;
    }

    // </editor-fold>
    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Mécanique de jeu">
    public void augmenteTour() {
        // TODO : Incrémenter le compteur de tour
        this.cptrTour++;
    }

    public void afficheTour() {
        // TODO : Afficher le tour actuel, tel que montré dans l'énoncé
        System.out.println("---------------\nTOUR ACTUEL: " + cptrTour + "\n---------------");
    }
    // </editor-fold>
}
