package web;
import projetbanque_entity.*;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import projetbanque_metier.banque_local;
@WebServlet(name="cs",urlPatterns={"/controleur"})
public class ContoleurServ extends HttpServlet {
	@EJB
	private banque_local metier;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/VueBanque.jsp").forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String act = request.getParameter("action");
		if(act.equals("Retirer")){
			int Code = Integer.parseInt(request.getParameter("Num Compte"));
		double s = Double.parseDouble(request.getParameter("Montant"));
			metier.retirer(Code, s);
			doGet(request, response);
		}
		if(act.equals("Verser")){
			int Code = Integer.parseInt(request.getParameter("Num Compte"));
		double s = Double.parseDouble(request.getParameter("Montant"));
			metier.verser(Code, s);
			doGet(request, response);
		}	
		
		if(act.equals("Ajouter")) {
		
			double sol = Double.parseDouble(request.getParameter("Solde"));
			DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			Date date = new Date();
			String d = dateFormat.format(date);
			Compte c = new Compte(sol,d);
			metier.addCompt(c);
			doGet(request, response);
				}
		if(act.equals("Supprimer")) {
			int cpt = Integer.parseInt(request.getParameter("Code Compte"));
			metier.supprimercmp(cpt);
			doGet(request, response);
		}
		if(act.equals("transferer")) {
			int Code1 = Integer.parseInt(request.getParameter("Num Compte expediteur"));
			int Code2 = Integer.parseInt(request.getParameter("Num Compte emmeteur"));
			int mt = Integer.parseInt(request.getParameter("montant à transferer"));
			metier.verser(Code2, mt);
			metier.retirer(Code1, mt);
			doGet(request, response);
		}
		if(act.equals("Afficher")) {
			List<Compte> cpt = metier.getAllCompt();
			request.setAttribute("comptes", cpt);
			doGet(request, response);
		}
	}

}
