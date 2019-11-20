public class Lion extends Felin {

    //Fields
    //We use those from the master class, Animal (Lion extends Felin extends Animal)

    // Constructor
    public Lion(String pCouleur, int pPoids) {
        this.couleur = pCouleur;
        this.poids = pPoids;
    }

    // Implement the abstract method crier()
    void crier() {
        System.out.println("Je rugis tel le roi de la savane que je suis !!");
    }
}
