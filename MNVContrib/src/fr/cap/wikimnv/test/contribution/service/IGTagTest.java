package fr.cap.wikimnv.test.contribution.service;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import fr.cap.wikimnv.contribution.service.IGTag;
import fr.cap.wikimnv.contribution.service.impl.GTagImpl;
import fr.cap.wikimnv.exception.MNVException;
import fr.cap.wikimnv.global.domain.pojo.Tag;

public class IGTagTest {
	
	IGTag gtag = new GTagImpl();
	String libelle = "test";
	Set<Tag> listetag = new HashSet<Tag>();
	@Test
	public void testRechercheTextuelle() {
		try {
			listetag = gtag.rechercheTextuelle(libelle);
		} catch (MNVException e) {
			fail("Not yet implemented");
		}
	}

}
