/**
 * MosticchioSimoneClass
 * @author <b> MosticchioSimone </b> <i> 13/05/2022 </i>
 * @version 1.0
 *
 */
public class MosticchioSimoneClass {
/**
 * Costruttore della classe MosticchioSimoneClass
 */
	public MosticchioSimoneClass () {
		
	}
	/**
	 * 
	 * @param s valore indice iniziale della produttoria
	 * @param f valore indice finale della produttoria
	 * @return risultato che viene returnato dalla funzione 
	 * ERRORE 1 r = r * r;
	 */
	
	
public int MosticchioMet (int s, int f) {
	int r=0;
	for(int i=1; i<f; i++) {
		r = r + r;
	}
	return r;
}
	
	/**
	 * 
	 * Main della classe 
	 */
	
	public static void main(String[] args) {
			MosticchioSimoneClass f = new MosticchioSimoneClass();
			System.out.println(f.MosticchioMet(5,7));
	}

}
