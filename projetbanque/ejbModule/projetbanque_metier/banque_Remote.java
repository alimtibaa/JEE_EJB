package projetbanque_metier;

import java.util.List;

import javax.ejb.Remote;

import projetbanque_entity.Client;
import projetbanque_entity.Compte;

@Remote
public interface banque_Remote {

	public int addCompt(Compte C);
	public List<Compte> getAllCompt() ;
	public  void verser (int Code , double MT );
	public  void retirer (int Code , double MT );
    public Compte consultercmp (int Code);
    public void supprimercmp (int Code);
    public int addClient(Client C);
	
}
