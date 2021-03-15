package tn.g3.spring.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.g3.spring.entities.Sinistre;
import tn.g3.spring.repository.SinistreRepository;

@Service
public class SinistreServiceImpl implements ISinistreSerivce{

	@Autowired     
	SinistreRepository sinistreRepository ;
	private static final Logger L = LogManager.getLogger(SinistreServiceImpl.class);
	
	@Override
	public Sinistre addSinistre(Sinistre s) {
		Sinistre sinistreSaved = null;
		sinistreSaved = sinistreRepository.save(s);
		
		return sinistreSaved;
	
	}
	@Override
	public void deleteSinistre(String id) {
		sinistreRepository.deleteById(Long.parseLong(id));
		
	}
	@Override
	public Sinistre updateSinistre(Sinistre s) {
		Sinistre sinistreAdded = sinistreRepository.save(s);
		return sinistreAdded;
	}
	
	@Override
	public Sinistre retrieveSinistre(String id) {
		L.info("in retrieveSinistre id = " + id);
		Sinistre s = sinistreRepository.findById(Long.parseLong(id)).get();
		L.info("sinistre returned = : " + s);
		return s;
			}
	
	
	@Override
	public List<Sinistre> retrieveAllSinistres() {
		List<Sinistre> sinistres = (List<Sinistre>) sinistreRepository.findAll(); 
		for(Sinistre sin : sinistres)
		{
			L.info("sinistre +++ :" + sin);
		}
					
		return sinistres;
	}		
	
}
