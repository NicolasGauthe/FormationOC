public class Main {

    public static void main(String[] args) {
            Ville ville1 = new Ville();
            Ville ville2 = new Ville("Rennes", 320000, "Bretagne");
            System.out.println("ville2 = "+ville2.getNomVille()+", c'est une ville de "+ville2.getNombreHabitants()+" habitants et elle se situe en "+ville2.getNomPays());

    }
}
