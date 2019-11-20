public class Chat extends Felin {
    //Fields
    //We use those from the master class, Animal (Chat extends Felin extends Animal)

    // Constructor
    public Chat(String pCouleur, int pPoids) {
        this.couleur = pCouleur;
        this.poids = pPoids;
    }

    // Implement the abstract method crier()
    void crier() {
        System.out.println("Je Miaule !!");
    }
}
