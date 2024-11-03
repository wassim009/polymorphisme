package b;

public class Developpeur extends Employe {
	rivate String langage;

    public Developpeur(String nom, int salaire, String langage) {
        super(nom, salaire);
        this.langage = langage;
    }

    @Override
    public void afficherInfos() {
        System.out.println("Nom: " + nom + ", Salaire: " + salaire + ", Langage: " + langage);
    }

    public void afficherLangage() {
        System.out.println("Langage utilisé : " + langage);
    }
}
