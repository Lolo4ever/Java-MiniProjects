import java.io.*; 
import java.util.*; 

public class LireMessage{
	public static void main(String args[]) {
	if (args.length < 1) {
	    System.out.println("usage: java EcrireMessage <dest>"); 
	}
	else {
	    try {
		File dest = new File(args[0]);
		FileInputStream fis = new FileInputStream(dest);
		ObjectInputStream oin = new ObjectInputStream(fis);
		//Object msg = oin.readObject();		
		System.out.println(oin.readObject());

		oin.close(); 
		fis.close(); 
	    }catch (ClassNotFoundException e) {
		System.err.println("wesh");
	    } catch (FileNotFoundException e) {
		System.err.println("ERR: Le fichier source n'existe pas ou le fichier de destination ne peut être crée ou ouvert."); 
	    } catch (IOException e) {
		System.err.println("ERR: entrée/sortie."); 
	    } finally {
		System.out.println("END"); 
	    }	    
	}
    }
}
