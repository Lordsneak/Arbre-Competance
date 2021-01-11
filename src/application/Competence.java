package application;

public class Competence extends Referentiel {

	private int id_cmptnce;
	private String nom_cmptnce;
	private int niveau;
	public Competence(int id_Ref, String nom_ref) {
		super(id_Ref, nom_ref);
		// TODO Auto-generated constructor stub
	}
	public Competence(int id_Ref, String nom_ref, int id_cmptnce, String nom_cmptnce, int niveau) {
		super(id_Ref, nom_ref);
		this.id_cmptnce = id_cmptnce;
		this.nom_cmptnce = nom_cmptnce;
		this.niveau = niveau;
	}
	public int getId_cmptnce() {
		return id_cmptnce;
	}
	public void setId_cmptnce(int id_cmptnce) {
		this.id_cmptnce = id_cmptnce;
	}
	public String getNom_cmptnce() {
		return nom_cmptnce;
	}
	public void setNom_cmptnce(String nom_cmptnce) {
		this.nom_cmptnce = nom_cmptnce;
	}
	public int getNiveau() {
		return niveau;
	}
	public void setNiveau(int niveau) {
		this.niveau = niveau;
	}
	
}