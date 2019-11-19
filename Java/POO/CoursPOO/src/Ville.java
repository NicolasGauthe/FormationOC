import java.util.Objects;

public class Ville {

// variable de classe

    // variable publique qui compte le nombre d'instance
    public static int nombreInstance = 0;

    // variable protected qui compte le nombre d'instance (avec getters et setters)
    protected static int nombreInstanceBis = 0;

    // Fields (champs)
    protected String mNomVille; // variable membre stockant le nom de la ville
    protected String mNomPays; // Variable membres stockant le nom du pays
    protected int mNombreHabitants; // variable membres stockant le nombre d'habitant
    protected char mcategorie;

    // Getters && Setters
    public int getNombreHabitants() {
        return mNombreHabitants;
    }
    public String getNomPays() {
        return mNomPays;
    }
    public String getNomVille() {
        return mNomVille;
    }
    public char getCategorie() {
        return mcategorie;
    }
    public static int getNombreInstanceBis() {return nombreInstanceBis;}


    public void setNombreHabitants(int NombreHabitants) {
        this.mNombreHabitants = NombreHabitants;
        this.setCategorie();
    }
    public void setNomPays(String NomPays) {
        this.mNomPays = NomPays;
    }
    public void setNomVille(String NomVille) {
        this.mNomVille = NomVille;
    }
    protected void setCategorie() {
        int borneSuperieur[] = {0,1000,10000,100000,500000,1000000,5000000};
        char categorie[] = {'?','A','B','C','D','E','F'};

        int i=0;
        while(i < borneSuperieur.length && this.mNombreHabitants > borneSuperieur[i])
            i++;

        this.mcategorie = categorie[i];
    }



    // Constructeur par defaut :
    public Ville(){
        nombreInstance++;
        nombreInstanceBis++;
        System.out.println("Creation du ville avec constructeur par defaut !");
        mNomVille = "inconnu";
        mNomPays = "inconnu";
        mNombreHabitants = 0;
        this.setCategorie();
    }



    // Constructeur avec parametre
    public Ville(String pNomVille, int pNbHabitant, String pNomPays){
        nombreInstance++;
        nombreInstanceBis++;
        System.out.println("Creation d'un objet Ville avec paramètres passés au constructeur");
        this.mNomVille = pNomVille;
        this.mNombreHabitants = pNbHabitant;
        this.mNomPays = pNomPays;
        this.setCategorie();
    }

    // Methodes
    @Override
    public String toString(){
        return "\t" +this.mNomVille+" est une ville de "+this.mNomPays+", elle comporte "+this.mNombreHabitants+" habitants, elle est donc de catégorie ==> "+this.mcategorie;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ville)) return false;
        Ville ville = (Ville) o;
        return mNombreHabitants == ville.mNombreHabitants &&
                mcategorie == ville.mcategorie &&
                mNomVille.equals(ville.mNomVille) &&
                mNomPays.equals(ville.mNomPays);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mNomVille, mNomPays, mNombreHabitants, mcategorie);
    }

    public String comparer(Ville v1){
        String str = new String();

        if(v1.getNombreHabitants() > this.mNombreHabitants){
            str = v1.getNomVille()+" est une ville plus peuplée que "+this.mNomVille;
        }
        else
            str = this.mNomVille+" est une ville plus peuplée que "+v1.getNomVille();

        return str;
    }

}
