public class Main {

    public static void main(String[] args) {
            Ville ville1 = new Ville();
            Ville ville2 = new Ville("Rennes", 320000, "Bretagne");
            System.out.println(ville2);
            Capitale capitale1 = new Capitale();
            System.out.println(capitale1);

            Capitale paris = new Capitale("Paris", 70000, "France", "La tour Effeil");
            System.out.println("\n"+paris);

    }
}
