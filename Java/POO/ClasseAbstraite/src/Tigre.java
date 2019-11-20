public class Tigre extends Felin {
    //Fields
    //We use those from the master class, Animal (Tigre extends Felin extends Animal)

    // Constructor
    public Tigre(String pCouleur, int pPoids) {
        this.couleur = pCouleur;
        this.poids = pPoids;
    }

    // Implement the abstract method crier()
    void crier() {
        System.out.println("Je Feule pour impressionner !!");
    }
}
