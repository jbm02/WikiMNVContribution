package fr.cap.wikimnv.contribution.service.impl;

import java.util.Set;

import fr.cap.wikimnv.contribution.service.IGArticle;
import fr.cap.wikimnv.domain.pojo.Article;
import fr.cap.wikimnv.domain.pojo.EtatPublication;
import fr.cap.wikimnv.exception.MNVException;
import fr.cap.wikimnv.global.service.ICRUD;
import fr.cap.wikimnv.global.service.impl.CrudImplBouchon;


public class GArticleImpl implements IGArticle{
ICRUD crud =new CrudImplBouchon();
	
	public void changerEtat (EtatPublication etatPublication, Object idArticle) throws MNVException{
		Article article=(Article)crud.lire(idArticle,Article.class);
		article.setEtat(etatPublication);	
	}
	public Set<?> lister(Class cl) throws MNVException {
		// TODO Auto-generated method stub
		return crud.lister(cl);
	}
	/**
	 * @param idArticle
	 * @throws MNVException 
	 */
	
	public Object supprimer(Object idArticle) throws MNVException{
		// TODO Auto-generated method stub
		return crud.supprimer(idArticle);
	}
	
	public Object sauver(Object idArticle) throws MNVException {
		// TODO Auto-generated method stub
		return crud.sauver(idArticle);
	// passer l'id  et le type
	}
	public Object lire(Object idArticle, Class cls) throws MNVException {
		return crud.lire(idArticle, Article.class);
		// TODO Auto-generated method stub

	}
	
}
