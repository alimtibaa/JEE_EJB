package projetbanque_metier;

import java.util.List;

import javax.ejb.Local;

import projetbanque_entity.Client;
import projetbanque_entity.Compte;

@Local
public interface banque_local {
	public int addCompt(Compte C);
	public List<Compte> getAllCompt() ;
	public  void verser (int Code , double MT );
	public  void retirer (int Code , double MT );
    public Compte consultercmp (int Code);
    public void supprimercmp (int Code);
    public int addClient(Client C);
    public List<Client> getAllClient() ;
    public void supprimerclient (int Code);
}
