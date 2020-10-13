import java.util.ArrayList;
import java.util.List;

public class ClientEtudiant {

	public static void main (String[] args) {
		Etudiant Toto = new Etudiant(1,"Toto","Camargo");
		Etudiant Tota = new Etudiant(2,"T5o","Camdfggo");
		GroupeEtudiant g = new GroupeEtudiant();
		g.ajout(Toto);
		g.ajout(Tota);
		System.out.println(g);
		System.out.println(g.recherche("Camargo"));

		MultiMap<String,Integer> mn = new MultiMap<String,Integer>();
		mn.putOneValue(1,"5");
		mn.putOneValue(1,"4");
		mn.putOneValue(2,"3");
		mn.putOneValue(4,"c5");
		mn.putOneValue(6,"5s");
	}
}
