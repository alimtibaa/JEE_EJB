package web;
import projetbanque_entity.*;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import projetbanque_metier.banque_local;
@WebServlet(name="csc",urlPatterns={"/client"})
public class ControleurClient extends HttpServlet {
	@EJB
	private banque_local metier;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/VueClient.jsp").forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String act = request.getParameter("action");
		if(act.equals("Ajouter")) {
			
			String n = request.getParameter("nom");
			String a = request.getParameter("add");
			String t = request.getParameter("tel");
			
			Compte c = new Compte();
			 List l = new LinkedList();
			 l.add(12);
			 List<Compte> cp =  new LinkedList();
			cp.add(c);
			Client cl = new Client(n, a, t, cp);
			
			metier.addClient(cl);
			doGet(request, response);
				}
		if(act.equals("Supprimer")) {
			int cpt = Integer.parseInt(request.getParameter("Code Client"));
			metier.supprimerclient(cpt);
			doGet(request, response);
		}
		if(act.equals("Afficher")) {
			List<Client> clt = metier.getAllClient();
			request.setAttribute("clients", clt);
			doGet(request, response);
		}
	}

}