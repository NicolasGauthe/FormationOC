package com.madhadesgames.testpackage;

public class Capitale extends Ville {

    private String monument;

    // Constructeur par defaut
    public Capitale(){

        super(); // ce mot clé "super" appel le constructeur par defaut de la classe mere
        monument = "aucun";
    }
    // Constructeur avec parametre
    public Capitale(String pnomCap, int pnombreHabitants, String pnomPays, String pmonument){
        super(pnomCap, pnombreHabitants,pnomPays);
        this.monument = pmonument;
    }

    /**
     * Description d'une capitale
     * @return String retourne la description de l'objet
     */
    public String toString(){
        String str = super.toString() + "\n \t ==>> "+ this.monument+" en est un monument";
        return str;
    }

}
