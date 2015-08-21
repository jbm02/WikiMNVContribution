package fr.cap.wikimnv.test.contribution.service;

import static org.junit.Assert.*;

import org.junit.Test;

import fr.cap.wikimnv.contribution.service.IGTemplate;
import fr.cap.wikimnv.contribution.service.impl.GTemplateImpl;
import fr.cap.wikimnv.domain.pojo.Template;
import fr.cap.wikimnv.exception.MNVException;

public class IGTemplateTest {
	IGTemplate gtemplate=new GTemplateImpl();
	Template template=new Template("document");
	
	@Test
	public void testAjouterMeta() {
		try{
			String test="titre";
			gtemplate.ajouterMeta(template, test);
			boolean expected=true;
			boolean actuel=template.getMeta().contains(test);
			assertEquals(expected, actuel);
		}catch(MNVException e) {
			e.getMessage();
		}
	}

	@Test
	public void testSupprimerMeta() {
		try {
		String test="titre";
			gtemplate.supprimerMeta(template, test);
			boolean expected=false;
			boolean actual=template.getMeta().contains(test);
			assertEquals(expected, actual);
		} catch (MNVException e) {
			e.getMessage();
		}
				
		
	}

}
