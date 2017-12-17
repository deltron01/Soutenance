package dao;

import java.util.Date;

public class Soutenance {
   
	private Long idS;
	private String departement;
	private String etudiant1;
	private String etudiant2;
	private String sujet;
	private String encadrant1, encadrant2;
	private String organisme;
	private String parrain1, parrain2;
	private Date datesoutenance;
	private String lieu;
	private String president;
	private String jury1, jury2, jury3;
	private Double note1, note2, note3, note4, note5;
	   // Constructeurs
	public Soutenance(String departement, String etudiant1, String etudiant2,
			String sujet, String encadrant1, String encadrant2,
			String organisme, String parrain1, String parrain2,
			Date datesoutenance, String lieu, String president, String jury1,
			String jury2, String jury3) {
		super();
		this.departement = departement;
		this.etudiant1 = etudiant1;
		this.etudiant2 = etudiant2;
		this.sujet = sujet;
		this.encadrant1 = encadrant1;
		this.encadrant2 = encadrant2;
		this.organisme = organisme;
		this.parrain1 = parrain1;
		this.parrain2 = parrain2;
		this.datesoutenance = datesoutenance;
		this.lieu = lieu;
		this.president = president;
		this.jury1 = jury1;
		this.jury2 = jury2;
		this.jury3 = jury3;
	}
	public Soutenance() {
		super();
	}
	    // Getters and Setters
	public Long getIdS() {
		return idS;
	}
	public void setIdS(Long idS) {
		this.idS = idS;
	}
	public String getDepartement() {
		return departement;
	}
	public void setDepartement(String departement) {
		this.departement = departement;
	}
	public String getEtudiant1() {
		return etudiant1;
	}
	public void setEtudiant1(String etudian1) {
		this.etudiant1 = etudian1;
	}
	public String getEtudiant2() {
		return etudiant2;
	}
	public void setEtudiant2(String etudian2) {
		this.etudiant2 = etudian2;
	}
	public String getSujet() {
		return sujet;
	}
	public void setSujet(String sujet) {
		this.sujet = sujet;
	}
	public String getEncadrant1() {
		return encadrant1;
	}
	public void setEncadrant1(String encadrant1) {
		this.encadrant1 = encadrant1;
	}
	public String getEncadrant2() {
		return encadrant2;
	}
	public void setEncadrant2(String encadrant2) {
		this.encadrant2 = encadrant2;
	}
	public String getOrganisme() {
		return organisme;
	}
	public void setOrganisme(String organisme) {
		this.organisme = organisme;
	}
	public String getParrain1() {
		return parrain1;
	}
	public void setParrain1(String parrain1) {
		this.parrain1 = parrain1;
	}
	public String getParrain2() {
		return parrain2;
	}
	public void setParrain2(String parrain2) {
		this.parrain2 = parrain2;
	}
	public Date getDatesoutenance() {
		return datesoutenance;
	}
	public void setDatesoutenance(Date datesoutenance) {
		this.datesoutenance = datesoutenance;
	}
	public String getLieu() {
		return lieu;
	}
	public void setLieu(String lieu) {
		this.lieu = lieu;
	}
	public String getPresident() {
		return president;
	}
	public void setPresident(String president) {
		this.president = president;
	}
	public String getJury1() {
		return jury1;
	}
	public void setJury1(String jury1) {
		this.jury1 = jury1;
	}
	public String getJury2() {
		return jury2;
	}
	public void setJury2(String jury2) {
		this.jury2 = jury2;
	}
	public String getJury3() {
		return jury3;
	}
	public void setJury3(String jury3) {
		this.jury3 = jury3;
	}
	public Double getNote1() {
		return note1;
	}
	public void setNote1(Double note1) {
		this.note1 = note1;
	}
	public Double getNote2() {
		return note2;
	}
	public void setNote2(Double note2) {
		this.note2 = note2;
	}
	public Double getNote3() {
		return note3;
	}
	public void setNote3(Double note3) {
		this.note3 = note3;
	}
	public Double getNote4() {
		return note4;
	}
	public void setNote4(Double note4) {
		this.note4 = note4;
	}
	public Double getNote5() {
		return note5;
	}
	public void setNote5(Double note5) {
		this.note5 = note5;
	}
	
	
}
