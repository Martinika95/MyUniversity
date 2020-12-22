
public class Esame {
	private String nomeEsame; 
	private int NumeroCrediti;
	private int voto;
	private boolean Lode;
	
	
	public Esame(String nomeEsame, int numeroCrediti, int voto, boolean lode) {
		super();
		this.nomeEsame = new String (nomeEsame);
		NumeroCrediti = numeroCrediti;
		this.voto = voto;
		Lode = lode;
	}
	
	public Esame(Esame x) {
		this.nomeEsame= new String(x.nomeEsame);
		NumeroCrediti = x.NumeroCrediti;
		this.voto = x.voto;
		Lode = x.Lode;
	}
	
	
	public String getNomeEsame() {
		return nomeEsame;
	}
	public void setNomeEsame(String nomeEsame) {
		this.nomeEsame = new String (nomeEsame);
	}
	public int getNumeroCrediti() {
		return NumeroCrediti;
	}
	public void setNumeroCrediti(int numeroCrediti) {
		NumeroCrediti = numeroCrediti;
	}
	public int getVoto() {
		return voto;
	}
	public void setVoto(int voto) {
		this.voto = voto;
	}
	public boolean isLode() {
		return Lode;
	}
	public void setLode(boolean lode) {
		Lode = lode;
	}

}
