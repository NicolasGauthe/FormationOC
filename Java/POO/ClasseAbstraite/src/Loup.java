public class Loup extends Canin {
    // Fields
    //We use those from the master class, Animal (Chien extends Canin extends Animal)

    // Constructor
    public Loup(String pCouleur, int pPoids) {
        this.couleur = pCouleur;
        this.poids = pPoids;
    }

    // Implementing the abstract method crier()
    void crier() {
        System.out.println("Je hurle a la mort sous la lune !!");
    }
}
