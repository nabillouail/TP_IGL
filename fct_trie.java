import java.util.Arrays;
import java.util.Collections;

public class VectorHelper {
	
	 public int [] VectorH;
	
 	

	 public  void triBulle(int tableau[]) {
			int longueur = tableau.length;
			int tampon = 0;
			boolean permut;
	 
			do {
				// hypoth�se : le tableau est tri�
				permut = false;
				for (int i = 0; i < longueur - 1; i++) {
					// Teste si 2 �l�ments successifs sont dans le bon ordre ou non
					if (tableau[i] > tableau[i + 1]) {
						// s'ils ne le sont pas, on �change leurs positions
						tampon = tableau[i];
						tableau[i] = tableau[i + 1];
						tableau[i + 1] = tampon;
						permut = true;
					}
				}
			} while (permut);
			VectorH=tableau;
		}
	 