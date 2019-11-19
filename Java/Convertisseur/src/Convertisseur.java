import java.util.Scanner;

public class Convertisseur {

    public static void main(String[] args) {
      LaunchApp();
    }

    private static void FarenheitVersCelsius() {
        double result;
        double tempToConvert;
        char repMenu=' ';
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Entrez la valeur à convertir en degrés Celsius : ");
            tempToConvert = sc.nextDouble();
            sc.nextLine();
            result = (((tempToConvert - 32)*5)/9);
            System.out.println(tempToConvert+" degrés Farenheit donne " + result + " degrés Celsius");
            do {
                repMenu = ' ';
                System.out.println("Souhaitez-vous convertir une autre température ? O/N");
                repMenu = sc.nextLine().charAt(0);
            }while (repMenu != 'O' && repMenu != 'o' && repMenu != 'N' && repMenu != 'n');

        }while (repMenu == 'O' || repMenu == 'o');

    }

    private static void CelciusVersFarenheit() {
        double result;
        double tempToConvert;
        char repMenu=' ';
        Scanner sc = new Scanner(System.in);
        do {
        System.out.println("Entrez la valeur à convertir en degrés Farenheit : ");
        tempToConvert = sc.nextDouble();
        sc.nextLine();
        result = (9/5)*tempToConvert + 32;
        System.out.println(tempToConvert+" degrés Celsius donne " + result + " degrés Farenheit");
        do {
            repMenu = ' ';
            System.out.println("Souhaitez-vous convertir une autre température ? O/N");
            repMenu = sc.nextLine().charAt(0);
        }while (repMenu != 'O' && repMenu != 'o' && repMenu != 'N' && repMenu != 'n');

        }while (repMenu == 'O' || repMenu == 'o');

    }
    private static void LaunchApp() {

        Scanner sc = new Scanner(System.in);
        char choixMenu=' ';


        System.out.println("Programme de Conversion Celsius vers Farenheit");
        System.out.println("..............................................");
        do {

            System.out.println("Choisissez un mode de conversion : ");
            System.out.println(" 1) Celsius vers Farenheit");
            System.out.println(" 2) Farenheit vers Celsius");
            System.out.println(" 3) Quitter");
            System.out.println("Votre choix ? 1 ou 2 ou 3");
            choixMenu = sc.nextLine().charAt(0);
        }while(choixMenu != '1' && choixMenu != '2' && choixMenu != '3');
        if(choixMenu == '1')
        {
            CelciusVersFarenheit();
        }
        else if(choixMenu == '2')
        {
            FarenheitVersCelsius();
        }
        else
        {
            System.exit(-1);
        }
    }


}
