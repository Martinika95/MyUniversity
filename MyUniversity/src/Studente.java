import java.util.Arrays;

public class Studente {
	
	@Override
	public String toString() {
		return "Studente [MAX_ESAMI=" + MAX_ESAMI + ", nome=" + nome + ", cognome=" + cognome + ", matricola="
				+ matricola + ", esami=" + Arrays.toString(esami) + ", numeroEsami=" + numeroEsami + "]";
	}
	private final int MAX_ESAMI=20;//final-> mi fa diventare questa variabile una costante 
	private String nome; 
	private String cognome ;
	private String matricola;
	
	private Esame[] esami;//array di esami associati allo studente
	//fattore di riempimento dell'array
	private int numeroEsami;
	
	//costruttore vuoto
	public Studente() {
		nome= new String("");
		cognome= new String("");
		esami= new Esame[MAX_ESAMI];
		numeroEsami=0;
	}
	
	//costruttore con parametri
	public Studente(String nome, String c,String m) {
		this.nome= new String(nome);
		cognome= new String(c);
		matricola= new String(m);	
		numeroEsami=0;
	}
	
	//costruttore copia
	public Studente(Studente s) {
		this.nome= new String(s.nome);
		this.cognome= new String(s.cognome);
		this.matricola= new String(s.matricola);
		esami=s.esami;
		numeroEsami=s.numeroEsami;
	}		
	
	public float calcolaMedia() {
		float somma=0;
		
		for(int i=0; i<numeroEsami; i++) {
			somma +=esami[i].getVoto();
			
		}
		
		float media = (float) somma/numeroEsami;
		return media ;
	}
	
	
	public void aggiungiEsame(Esame e) throws MassimoNumeroEsamiRaggiunto {
		if( numeroEsami<MAX_ESAMI) {
		esami[numeroEsami]= new Esame(e);
		numeroEsami++;
		} else throw new MassimoNumeroEsamiRaggiunto("Attenzione, si possono inserire al massimo" + this.MAX_ESAMI);
	}
	
	
	public void stampaCarriera() {
		System.out.println("Carriera dello studente"+this.nome+" "+this.cognome);
		for (int i=0; i<numeroEsami; i++) {
			System.out.println("Esame di"+ esami[i].getNomeEsame()+ "superato con "+esami[i].getVoto());
			if (esami[i].isLode()) System.out.println("con Lode");
			else System.out.println("");
		}
		System.out.println("Totale esami sostenuti:  " + this.numeroEsami);
	}
	
	public String getMatricola() {
		return matricola;
	}

	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}
	
	public void stampaMedia() {
		System.out.println("la media di "+nome+" "+cognome+" è " + this.calcolaMedia()); //non metto la variabile globale media e chiamo direttamente il metodo 
	}
	
	public void setNome(String n) {
		this.nome= new String(n);
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	
	

	
	

}
