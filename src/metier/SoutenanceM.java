package metier;

import java.util.List;

import dao.Soutenance;

public interface SoutenanceM {
	
	public Soutenance getSoutenanceById(Long id);
	public void ajouterSoutenance(Soutenance S);
	public List<Soutenance> getAllSoutenances();
	public List<Soutenance> getSoutenanceByField(String f, String v);
	public List<Soutenance> getSoutenanceByDate(String f, String v);
	public void annulerSoutenance(Long id);

}
