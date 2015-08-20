package fr.cap.wikimnv.test.contribution.service;

import static org.junit.Assert.*;

import org.junit.Test;

import fr.cap.wikimnv.contribution.service.IGArticle;
import fr.cap.wikimnv.contribution.service.impl.GArticleImpl;
import fr.cap.wikimnv.domain.pojo.Article;
import fr.cap.wikimnv.domain.pojo.Profil;

public class IGArticleTest {
	IGArticle gArticle =new GArticleImpl();
	Article article = new Article(new Profil(), null);
	@Test
	public void testChangerEtat() {
		fail("Not yet implemented");
	}

	@Test
	public void testLister() {
		fail("Not yet implemented");
	}

	@Test
	public void testLire() {
		fail("Not yet implemented");
	}

	@Test
	public void testSupprimer() {
		fail("Not yet implemented");
	}

	@Test
	public void testSauver() {
		
		gArticle.sauver(article);
	}

}
