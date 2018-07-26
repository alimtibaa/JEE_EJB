package service;

import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import projetbanque_entity.Compte;
import projetbanque_metier.banque_local;

@Stateless
@WebService
public class BanqueServ {
	@EJB
    private banque_local bq;
	@WebMethod
	public List<Compte> ConsulterComptes(){
		return bq.getAllCompt();
	}
	@WebMethod(operationName="ajouterCompte")
	public void addCmp(@WebParam(name="s") double solde){
		//Compte c = new Compte(solde, new Date());
		//bq.addCompt(c);
	}

}
