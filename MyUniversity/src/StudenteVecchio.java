public class StudenteVecchio {  
	//attributi della classe Studente
	//private-> non sono visibili fuori dalla classe
	
	private String nome; 
	private String cognome;
	private int votoAnalisi;
	private int votoFisica;
	private int votoInformatica;
	
	
	//metodo costruttore, devo dare parametri di scambio(con il tipo) di ingresso
	public StudenteVecchio (String nome, String c, int a, int f, int i) {
		this.nome= new String(nome);
		cognome= new String(c);
		votoAnalisi = a;
		votoFisica = f;
		votoInformatica = i;		
	}
	//costruttore vuoto
	public StudenteVecchio() {
		nome= new String("");
		cognome= new String("");
		votoAnalisi= 0;
		votoFisica= 0;
		votoInformatica= 0;
	}
	// costruttore di copia
	public StudenteVecchio(StudenteVecchio s) {
		this.nome= new String(s.nome);
		this.cognome= new String(s.cognome);
		this.votoAnalisi=s.votoAnalisi;
		this.votoFisica=s.votoFisica;
		this.votoInformatica=s.votoInformatica;
	}	
	
	//metodo media 
	public float calcolaMedia() {
		float media =(float) (votoAnalisi+ votoFisica+ votoInformatica)/3;
		return media ;
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
	public int getVotoAnalisi() {
		return votoAnalisi;
	}
	public void setVotoAnalisi(int votoAnalisi) {
		this.votoAnalisi = votoAnalisi;
	}
	public int getVotoFisica() {
		return votoFisica;
	}
	public void setVotoFisica(int votoFisica) {
		this.votoFisica = votoFisica;
	}
	public int getVotoInformatica() {
		return votoInformatica;
	}
	public void setVotoInformatica(int votoInformatica) {
		this.votoInformatica = votoInformatica;
	}
	
	
}

