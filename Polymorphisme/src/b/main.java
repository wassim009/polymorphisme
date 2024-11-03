package b;

public class main {

	public static void main(String[] args) {
        Vehicule[] vehicules = {new Voiture(), new Velo()};
        
        for (Vehicule vehicule : vehicules) {
            vehicule.seDeplacer();
        }
    }

}
