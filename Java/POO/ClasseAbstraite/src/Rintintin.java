public interface Rintintin {
    //L'interface déclare des methodes que nous devront implementer dans la classe qui utilisera l'interface
    void faireCalin();
    void faireLechouille();
    void faireLeBeau();
    default void faireCheck() {
        System.out.println("Je check avec la patte !");
    }
}
