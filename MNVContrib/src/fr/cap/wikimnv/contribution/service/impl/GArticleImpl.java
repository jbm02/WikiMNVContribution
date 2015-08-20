package fr.cap.wikimnv.contribution.service.impl;

import fr.cap.wikimnv.contribution.service.IGArticle;
import fr.cap.wikimnv.domain.pojo.Article;
import fr.cap.wikimnv.domain.pojo.EtatPublication;
import fr.cap.wikimnv.global.service.impl.CrudImpl;


public class GArticleImpl extends CrudImpl implements IGArticle{

	public void changerEtat (EtatPublication etat, Object key){
		Article article=(Article)lire(key);
		article.setEtatPublication(etat);
		sauver(article);
		
	}

}
