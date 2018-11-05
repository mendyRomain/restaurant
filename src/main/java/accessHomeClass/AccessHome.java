package accessHomeClass;

public class AccessHome {
	
	private String id ;
	private String mdp;
	private String nomInterface;
	
	public AccessHome() {
		super();
	}

	public AccessHome(String id, String mdp, String nomInterface) {
		super();
		this.id = id;
		this.mdp = mdp;
		this.nomInterface = nomInterface;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMdp() {
		return mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

	public String getNomInterface() {
		return nomInterface;
	}

	public void setNomInterface(String nomInterface) {
		this.nomInterface = nomInterface;
	}

	@Override
	public String toString() {
		return "AccessHome [id=" + id + ", mdp=" + mdp + ", nomInterface=" + nomInterface + "]";
	}
	
	
	
	
	

	

}
