abstract class Animal {


    // Fields
    public int poids;
    public String couleur;

    // Methods
    public void manger() {
        System.out.println("Je mange de la viande.");
    }

    public void boire() {
        System.out.println("Je bois de l'eau");
    }

    public String toString() {
        String str = "Je suis un objet de la "+this.getClass()+ ", je suis "+this.couleur+", et je pèse "+this.poids;
        return str;
    }

    // Abstract Method

    abstract void crier();
    abstract void deplacement();
}
