package fr.cap.wikimnv.test.contribution.service;

import static org.junit.Assert.*;

import org.junit.Test;

import fr.cap.wikimnv.contribution.service.IGArticle;
import fr.cap.wikimnv.domain.pojo.Article;

public class IGArticleTest {
	IGArticle gArticle;
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
		Article article = new Article();
		gArticle.sauver(article);
	}

}
