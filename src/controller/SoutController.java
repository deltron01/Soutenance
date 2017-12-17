package controller;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import metier.SoutenanceM;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import dao.Soutenance;

@Controller
public class SoutController {
	@Autowired
	SoutenanceM sout;
	
	@RequestMapping(value="/search")
	public String pageSearch(Model model,@RequestParam String id,@RequestParam String val) /* id représente exactement le id qui figure 
	dans l'attribut name de la balise qui est dans form */
	{
		List<Soutenance> L = new ArrayList<Soutenance>();				
		L = sout.getSoutenanceByField( id, val);
		model.addAttribute("listeSout", L);
		return "Default";
	}
	@RequestMapping(value="/add")
	public String ajouter(@RequestParam String etudiant1,@RequestParam String etudiant2,@RequestParam String departement,
			@RequestParam String sujet,@RequestParam String date,@RequestParam String encadrant1,
			@RequestParam String encadrant2,@RequestParam String organisme,@RequestParam String parrain1,
			@RequestParam String parrain2,@RequestParam String lieu,@RequestParam String president,
			@RequestParam String jury1,@RequestParam String jury2,@RequestParam String jury3)
	{	
		DateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
		Date result = new Date();
		try {
			result = fmt.parse(date);
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
		sout.ajouterSoutenance(new Soutenance( departement, etudiant1, etudiant2,
			    sujet, encadrant1, encadrant2,
				organisme, parrain1, parrain2,
				result, lieu, president, jury1,
				jury2, jury3));
		return "Default";
		// ça donne  /Prefix/Default.jsp  ( jsp = suffixe, ici )  --> fichier servlet-config.xml
	}
	@RequestMapping(value="/delete")
	public String loschen(@RequestParam Long id)
	{			
		sout.annulerSoutenance(id);
		return "Default";
		// ça donne  /Prefix/Default.jsp  ( jsp = suffixe, ici )  --> fichier servlet-config.xml
	}
	@RequestMapping(value="/pardate")
	public String searchbyDate(Model model,@RequestParam String date1,@RequestParam String date2) /* id représente exactement le id qui figure 
	dans l'attribut name de la balise qui est dans form */
	{
		List<Soutenance> L = new ArrayList<Soutenance>();				
		L = sout.getSoutenanceByDate( date1, date2);
		model.addAttribute("listeSout", L);
		return "Default";
	}
	@RequestMapping(value="/getall")
	public String getall(Model model)
	{				
		model.addAttribute("listeSout", sout.getAllSoutenances());
		return "Default";
	}
	@RequestMapping(value="/details")
	public String afficherS(Model model,@RequestParam Long id)
	{				
		model.addAttribute("s", sout.getSoutenanceById(id));
		return "details";
	}
}
