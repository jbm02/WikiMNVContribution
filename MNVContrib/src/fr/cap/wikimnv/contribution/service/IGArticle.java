package fr.cap.wikimnv.contribution.service;

import java.util.Set;

import fr.cap.wikimnv.domain.pojo.Article;

import fr.cap.wikimnv.domain.pojo.EtatPublication;
import fr.cap.wikimnv.global.service.ICRUD;

public interface IGArticle extends ICRUD {
	/**
	 * elle permet de changer l'etat de mon article
	 * les états possible :<br/>
	 * -Publié <br/>
	 * -Archivé<br/>
	 * -Brouillon "état initial"
	 * @param etat
	 * @param key
	 */
	void changerEtat (EtatPublication etat, Object key);
}
