package b;

public class main2 {

	public static void main(String[] args) {
		 Employe[] employes = {
		            new Developpeur("wassim", 50000, "Java"),
		            new Manager("alamy", 70000, 5)
		        };
		        
		        for (Employe employe : employes) {
		            employe.afficherInfos();
		        }

	}
	Employe emp = new Developpeur("Alice", 50000, "Java");
	empl.afficherInfos();
    
	
	for (Employe employe : employes) {
	    employe.afficherInfos();

	    if (employe instanceof Developpeur) {
	        Developpeur dev = (Developpeur) employe;
	        dev.afficherLangage();
	    } else if (employe instanceof Manager) {
	        Manager mgr = (Manager) employe;
	        mgr.gererEquipe();
	    }
	}

}
