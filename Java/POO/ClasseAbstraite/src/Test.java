public class Test {

    public static void main(String[] args) {

        // les methodes d'un chien
        Chien hades = new Chien("Noir et Blanc", 27);
        hades.boire();
        hades.manger();
        hades.deplacement();
        hades.crier();
        hades.faireCalin();
        System.out.println(hades.toString());

        // Exemple de polymorphisme
        System.out.println("---------------------------------------------------");

        Rintintin helios = new Chien("tout noir", 10);
        helios.faireCalin();
        helios.faireLeBeau();
        System.out.println(helios);
    }
}
