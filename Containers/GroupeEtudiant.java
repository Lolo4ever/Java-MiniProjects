import java.util.ArrayList;
import java.util.List;

public class GroupeEtudiant {

	//attributs
	private ArrayList<Etudiant> l = new ArrayList<Etudiant>();
	
	//constructeur : pas besoin
	

	public void ajout(Etudiant e) {
		l.add(e);
	}
	public List<Etudiant> recherche(String nom){
		List<Etudiant> res = new ArrayList<Etudiant>();		
		for( Etudiant e : l){
			if(e.aCeNom(nom)){
				res.add(e);
			}
		}
		return res;
	}
	public String toString(){
		return l.toString();
	}

}
