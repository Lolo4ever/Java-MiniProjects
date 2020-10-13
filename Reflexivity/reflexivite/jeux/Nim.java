import fr.insalyon.tc.framework; 

public class Nim implements JeuCombinatoire {
    private int n =15;//nb courant d'éléments   


    /** indique si le jeu est fini ('true') ou non ('false') */
    public boolean estFini(){
        return (n<=0);
    }


    /** Coup realise par un joueur
     * @param unCoup coup d'un joueur
     * @return 'true' si le coup est valide et que la position
     * a ete modifiee en consequence, 'false' sinon
     */
    public boolean joueUnCoup(String unCoup){
        int d = Integer.parseInt(unCoup);
        if ( (d>= 1) && (d <= 3) && (d<=n) ){
            n-=d;
            return true
        }
        else return false;
    }  
   
    public String toString{
        return "il reste" +n;
    }
}
