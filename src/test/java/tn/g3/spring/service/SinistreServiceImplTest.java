package tn.g3.spring.service;
import java.text.ParseException; 
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.Test; 
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import tn.g3.spring.entities.Sinistre;
import tn.g3.spring.entities.Status;
import tn.g3.spring.entities.TypeSinistre;
import tn.g3.spring.service.ISinistreSerivce;

import org.junit.Assert;


@RunWith(SpringRunner.class)
@SpringBootTest
public class SinistreServiceImplTest {
	@Autowired 
	ISinistreSerivce is;

	/*@Test
	public void testRetrieveAllUsers() {
		List<Sinistre> sinistres = is.retrieveAllSinistres() ;
	Assert.assertEquals(1, sinistres.size()); }
	
	 @Test
	    public void testAddSinistre() throws ParseException    {
	    	SimpleDateFormat dateFormat = new SimpleDateFormat ("yyyy-MM-dd");
	    	Date d = dateFormat.parse("2018-02-02");
	    	Sinistre s = new Sinistre (TypeSinistre.VIE, "My first sinistre",d,Status.En_Cous, null );
	    	Sinistre sinistreAdded = is.addSinistre(s);
	    	Assert.assertEquals(s.getIdSinistre(), sinistreAdded.getIdSinistre());

	    } 
	*/
	  
		@Test
		public void testUpdateSinistre() throws ParseException    {
			SimpleDateFormat dateFormat = new SimpleDateFormat ("yyyy-MM-dd");
			Date d = dateFormat.parse("2018-02-02");
			Sinistre s = new Sinistre (2, TypeSinistre.VIE, "My first sinistre MODIFIED AGAIN",d, Status.En_Cous, null );
			Sinistre sinistreUpdated = is.updateSinistre(s);
			Assert.assertEquals(s.getDescription(), sinistreUpdated.getDescription());

		} 
		
/*
		@Test
		public void testRetrieveSinistre() {
			Sinistre sinistre = is.retrieveSinistre("5"); 
			Assert.assertEquals(5, sinistre.getIdSinistre());
		} 
		*/
		@Test
		public void testDeleteSinistre() {
			
			is.deleteSinistre("8");
		}
		
	
	
	
}
