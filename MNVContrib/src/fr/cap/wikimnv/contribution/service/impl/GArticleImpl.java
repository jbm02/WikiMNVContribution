package fr.cap.wikimnv.contribution.service.impl;

import java.util.Set;

import fr.cap.wikimnv.contribution.service.IGArticle;
import fr.cap.wikimnv.domain.pojo.Article;
import fr.cap.wikimnv.domain.pojo.EtatPublication;
import fr.cap.wikimnv.global.service.ICRUD;
import fr.cap.wikimnv.global.service.impl.CrudImpl;


public class GArticleImpl implements IGArticle{
ICRUD crud =new CrudImpl();
	public void changerEtat (EtatPublication etat, Object key){
		Article article=(Article)lire(key);
		article.setEtat(etat);
		sauver(article);
		
	}
	@Override
	public Set<?> lister(Class cl) {
		// TODO Auto-generated method stub
		return crud.lister(cl);
	}
	@Override
	public Object lire(Object obj) {
		// TODO Auto-generated method stub
		return crud.lire(obj);
	}
	@Override
	public Object supprimer(Object obj) {
		// TODO Auto-generated method stub
		return crud.sauver(obj);
	}
	@Override
	public Object sauver(Object obj) {
		// TODO Auto-generated method stub
		return null;
	}

}
