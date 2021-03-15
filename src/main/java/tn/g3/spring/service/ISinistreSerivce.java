package tn.g3.spring.service;

import java.util.List;

import tn.g3.spring.entities.Sinistre;


public interface ISinistreSerivce {

	 List<Sinistre> retrieveAllSinistres(); 
	 Sinistre addSinistre(Sinistre s);
	 void deleteSinistre(String id);
	 Sinistre updateSinistre(Sinistre s);
	 Sinistre retrieveSinistre(String id);
}

