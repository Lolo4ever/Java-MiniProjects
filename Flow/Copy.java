import java.io.*;

public class Copy {

	private static void copy(InputStream is, OutputStream os) throws IOException{
		int val=is.read();		
		while(val != -1){		
			os.write(val);
			val=is.read();
		}
	
		
	}

	private static void copy(InputStream is) throws IOException/*on propage*/{
		int val=is.read();		
		while(val != -1){
			System.out.println(val);		
			val=is.read();
		}
	

	}

	private static void copy() throws IOException{
		int inChar = System.in.read();
    		System.out.println("Vous avez saisi: "+inChar);
		
	}
		


	public static void main (String[] args) {
		FileInputStream fin = null;
		FileOutputStream fout = null;
		try{	
			switch(args.length) {//pas besion de surcharge du coup
			case 2:	
				File f1 = new File(args[0]);
				File f2 = new File(args[1]);

				fin = new FileInputStream(f1);
				fout = new FileOutputStream(f2);

				break;
			case 1:
				//File f1 = new File(args[0]);
				fin = new FileInputStream(f1);
				fout = System.out;
				break;
			case 0:
				fin=System.in;
				fout=System.out;

			}


			copy(fin,fout);
		}catch(FileNotFoundException e) {
			System.err.println("err: pas de fichier");
		}catch(IOException e) {
			System.err.println("err: entre-sortie");
		}finally{
			//fin.close();
			//fout.close();
		}
		//copy(fin);
		//copy;
	}
}
