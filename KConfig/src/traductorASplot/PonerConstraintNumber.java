package traductorASplot;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

public class PonerConstraintNumber {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int contador=1;
		String sCadena;
		FileReader fr= new FileReader ("C:/Users/Matias/git/investigacion2015/KConfig/src/restricciones.txt");
		BufferedReader bf = new BufferedReader(fr);
		
		while((sCadena = bf.readLine())!=null){
			System.out.println("constraint_"+contador+":"+sCadena);
			contador++;
		}		
	}

}
