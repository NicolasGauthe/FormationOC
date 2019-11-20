public class Chien extends Canin implements Rintintin{
    // Fields
    //We use those from the master class, Animal (Chien extends Canin extends Animal)

    // Constructor
    public Chien(String pCouleur, int pPoids) {
        this.couleur = pCouleur;
        this.poids = pPoids;

    }

    // implementing the abstract methode crier()
    @Override
    void crier() {
        System.out.println("J'aboie comme un malade !!");
    }

    // implementing the interface : faireCalin(), faireLechouille(), et faireLeBeau()


    @Override
    public void faireCalin() {
        System.out.println("Je te fais de grooooos calins !!");
    }

    @Override
    public void faireLechouille() {
        System.out.println("Je te fais pleins de lechouilles !!!");
    }

    @Override
    public void faireLeBeau() {
        System.out.println("Je sais faire le beau !");
    }
}
