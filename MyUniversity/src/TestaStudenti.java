
public class TestaStudenti {

	public static void main(String[] args) {
		
		Studente pasquale = new StudenteDigita("Pasquale","Pollice","n36444", "Buono", "Buono");
		StudenteVecchio angelo = new StudenteVecchio("Angelo","Belardo",25,27,30);
		StudenteVecchio valentina= new StudenteVecchio("Valentina","Russo",30,30,30);
		
		
		
		pasquale.stampaMedia();
		angelo.stampaMedia();
		System.out.println("Mi dispiace, ma vado meglio io: media" +valentina.calcolaMedia());
	
		
		//nuovo studente con costrutto vuoto 
		Studente gianni =new Studente("Gianni", "Morandi","");
		Esame analisi= new Esame("Analisi Matematica",9,18,false);
		
		Esame inglese= new Esame("Inglese",6,25,false);
		
		gianni.stampaMedia();
	
		//esempio di polimorfismo
		
		Studente[] studenti=new Studente[2];
		studenti[0]= pasquale;
		studenti[1]= gianni;
		
		//il seguente codice ottiene un comportamento diverso su stampa carriera 
		//a seconda dell'oggetto su cui invochiamo il metodo
		for (int i=0; i<studenti.length; i++)
			studenti[i].stampaCarriera();
		
		
		
		/*if (pasquale.equals(angelo)) 
		System.out.println("Clone");*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
}