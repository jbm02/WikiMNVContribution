package fr.cap.wikimnv.test.contribution.service;

import static org.junit.Assert.fail;

import org.junit.Test;

import fr.cap.wikimnv.contribution.service.IGArticle;
import fr.cap.wikimnv.contribution.service.impl.GArticleImpl;
import fr.cap.wikimnv.domain.pojo.Article;
import fr.cap.wikimnv.domain.pojo.EtatPublication;
import fr.cap.wikimnv.exception.MNVException;

public class IGArticleTest {
	IGArticle gArticle =new GArticleImpl();
	Article article;
	@Test
	public void testChangerEtat() {
		try{
			EtatPublication etatPublication=EtatPublication.PUBLIE;
			Object idArticle="1";
			gArticle.changerEtat(etatPublication, idArticle);
		}
		catch(MNVException e){
			fail(e.getMessage());	
		}
	}

	@Test
	public void testLister() {
	
		try{
		
			gArticle.lister(getClass());
		}
		catch(MNVException e){
			fail(e.getMessage());	
		}
		
	}

	@Test
	public void testLire() {
try{
			
			Object idArticle="1";
			gArticle.supprimer(idArticle);
		}
		catch(MNVException e){
			fail(e.getMessage());
		}
	}

	@Test
	public void testSupprimer() {
		try{
			
			Object idArticle="1";
			gArticle.supprimer(idArticle);
		}
		catch(MNVException e){
			fail(e.getMessage());
		}
	}

	@Test
	public void testSauver() {
try{
			
			Object idArticle="1";
			gArticle.supprimer(idArticle);
		}
		catch(MNVException e){
			fail(e.getMessage());
		}	
	
	}

}
