public class Ville {

    private String mNomVille; // variable membre stockant le nom de la ville
    private String mNomPays; // Variable membres stockant le nom du pays
    private int mNombreHabitants; // variable membres stockant le nombre d'habitant
    private char mcategorie;

    // Constructeur par defaut :
    public Ville(){
        System.out.println("Creation du ville avec constructeur par defaut !");
        mNomVille = "inconnu";
        mNomPays = "inconnu";
        mNombreHabitants = 0;
        this.setCategorie();
    }



    // Constructeur avec parametre
    public Ville(String pNomVille, int pNbHabitant, String pNomPays){
        System.out.println("Creation d'un objet Ville avec paramètres passés au constructeur");
        this.mNomVille = pNomVille;
        this.mNombreHabitants = pNbHabitant;
        this.mNomPays = pNomPays;
    }

    public int getNombreHabitants() {
        return mNombreHabitants;
    }

    public void setNombreHabitants(int NombreHabitants) {
        this.mNombreHabitants = NombreHabitants;
    }

    public String getNomPays() {
        return mNomPays;
    }

    public void setNomPays(String NomPays) {
        this.mNomPays = NomPays;
    }

    public String getNomVille() {
        return mNomVille;
    }

    public void setNomVille(String NomVille) {
        this.mNomVille = NomVille;
    }
    private void setCategorie() {
        int borneSuperieur[] = {0,1000,10000,100000,500000,1000000,5000000};
        char categorie[] = {'?','A','B','C','D','E','F'};

        int i=0;
        while(i < borneSuperieur.length && this.mNombreHabitants > borneSuperieur[i]){
            i++;
        }
            this.mcategorie = categorie[i];
    }

    public char getCategorie() {
        return mcategorie;
    }

    public void setCategorie(char categorie) {
        this.mcategorie = categorie;
    }
}
