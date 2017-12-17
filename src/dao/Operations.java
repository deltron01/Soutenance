package dao;

import java.util.List;

public interface Operations {
	
	public Soutenance getSoutenanceById(Long id);
	public List<Soutenance> getSoutenanceByEtudiant(String v);
	public List<Soutenance> getSoutenanceByEncadrant(String v);
	public List<Soutenance> getSoutenanceByJury(String v);
	public List<Soutenance> getSoutenanceByOrganisme(String v);
	public List<Soutenance> getSoutenanceByDate(String v, String w);
	public void ajouterSoutenance(Soutenance S);
	public List<Soutenance> getAllSoutenances();
	public void annulerSoutenance(Long id);  // Supprimer la soutenance !

}
