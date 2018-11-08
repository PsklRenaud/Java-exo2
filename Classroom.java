
public class Classroom {

	public static void main(String[] args) {
		//Ici, je déclare mes objets
		Wilder kevin = new Wilder("Kevin", true);
		Wilder loic = new Wilder("Loic", false);
		//Ici, j'invoque la methode
		System.out.println(kevin.whoAmI());
		System.out.println(loic.whoAmI());
		
		

	}

}
