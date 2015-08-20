package fr.cap.wikimnv.contribution.service;

import java.util.Set;

import fr.cap.wikimnv.domain.pojo.Article;

import fr.cap.wikimnv.domain.pojo.EtatPublication;
import fr.cap.wikimnv.global.service.ICRUD;

public interface IGArticle extends ICRUD {
	/**
	 * elle permet de changer l'etat de mon article
	 * les �tats possible :<br/>
	 * -Publi� <br/>
	 * -Archiv�<br/>
	 * -Brouillon "�tat initial"
	 * @param etat
	 * @param key
	 */
	void changerEtat (EtatPublication etat, Object key);
}
