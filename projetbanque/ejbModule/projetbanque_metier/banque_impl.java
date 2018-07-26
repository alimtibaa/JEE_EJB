package projetbanque_metier;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import projetbanque_entity.Client;
import projetbanque_entity.Compte;

@Stateless(name="BK")
public class banque_impl implements banque_Remote, banque_local {
	
	@PersistenceContext (unitName="UP_banqueejb")
	private EntityManager em ;

	@Override
	public int addCompt(Compte C) {
		em.persist(C);
		// TODO Auto-generated method stub
		return C.getCode();
	}

	@Override
	public List<Compte> getAllCompt() {
		Query req = em.createQuery("select c from Compte c");
		return req.getResultList();
		 
	}

	@Override
	public void verser(int Code, double MT) {
		
		Compte cp =  em.find(Compte.class, Code);
		cp.setSolde(cp.getSolde()+MT);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void retirer(int Code, double MT) {
		Compte cp =  em.find(Compte.class, Code);
		cp.setSolde(cp.getSolde()-MT);
		// TODO Auto-generated method stub
		
	}

	@Override
	public Compte consultercmp(int Code) {
		Compte cp =  em.find(Compte.class, Code);
		// TODO Auto-generated method stub
		return cp;
	}

	@Override
	public void supprimercmp(int Code) {
		Compte cp =  em.find(Compte.class, Code);
	    em.remove(cp);
		// TODO Auto-generated method stub
		
	}

	@Override
	public int addClient(Client C) {
		em.persist(C);
		// TODO Auto-generated method stub
		return C.getId();
	}

	@Override
	public List<Client> getAllClient() {
		// TODO Auto-generated method stub
		Query req = em.createQuery("select c from Client c");
		return req.getResultList();
	}

	@Override
	public void supprimerclient(int Code) {
		// TODO Auto-generated method stub
		Client cp =  em.find(Client.class, Code);
	    em.remove(cp);
		
	}

}
