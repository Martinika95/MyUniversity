
public class StudenteDigita extends Studente {
	
	
	private String giudizioChallengePython;
	private String giudizioChallengeJava;
	
	
	public StudenteDigita() {
		super();
		giudizioChallengeJava= new String("");
		giudizioChallengePython= new String("");
	}
	
	public StudenteDigita(String n, String c,String m,String gJ, String jP) {
		super(c,n,m);
		giudizioChallengeJava= new String(gJ);
		giudizioChallengePython= new String(jP);
		
	}
	
	public void stampaCarriera() {
		super.stampaCarriera();
		System.out.println("i giudizi delle challenge digita somno stati:  ");
		System.out.println("Per la challenge Python:  "+this.giudizioChallengePython);
		System.out.println("Per la challenge Java:  "+this.giudizioChallengeJava);
	}
}
