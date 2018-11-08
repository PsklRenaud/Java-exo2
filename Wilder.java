// c'est la classe
public class Wilder {
	//Ici, je déclare mes attributs en privé
	private String firstname;
	private boolean aware;
	
	//Ici, mon constructeur qui correspond a chaque attribut
	public Wilder(String firstname,boolean aware) {
		this.firstname=firstname;
		this.aware=aware;
	}

	//Ici, mes getters
	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public boolean isAware() {
		return this.aware;
	}

	public void setAware(boolean aware) {
		this.aware = aware;
	}

	//Ici, j'utilse les getters de mes attributs dans mes variables pour utiliser la methode
	public String whoAmI() {
		if(this.aware) {
			return "Je m'appelle "+ this.getFirstname() + " et je suis aware";
		} 
		else {
			return "Je m'appelle "+ this.getFirstname() + " et je ne suis pas aware";
		}
	}	
}
