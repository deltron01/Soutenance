package metier;

import java.util.List;

import dao.Operations;
import dao.Soutenance;

public class SoutenanceMmp implements SoutenanceM {

	private Operations dao;
	
	public void setDao(Operations dao) {
		this.dao = dao;
	}

	@Override
	public Soutenance getSoutenanceById(Long id) {
		return dao.getSoutenanceById(id);
	}

	@Override
	public void ajouterSoutenance(Soutenance S) {
           dao.ajouterSoutenance(S);
	}

	@Override
	public List<Soutenance> getAllSoutenances() {
		return dao.getAllSoutenances();
	}

	@Override
	public void annulerSoutenance(Long id) {
             dao.annulerSoutenance(id);
	}

	@Override
	public List<Soutenance> getSoutenanceByField(String f, String v) {	
		switch (f) {
		case "etudiant" : return dao.getSoutenanceByEtudiant(v);
		case "encadrant" : return dao.getSoutenanceByEncadrant(v);
		case "jury" : return dao.getSoutenanceByJury(v);
		case "organisme" : return dao.getSoutenanceByOrganisme(v);
		}
		return null;
	}

	@Override
	public List<Soutenance> getSoutenanceByDate(String f, String v) {
		return dao.getSoutenanceByDate(f, v);
	}

}
