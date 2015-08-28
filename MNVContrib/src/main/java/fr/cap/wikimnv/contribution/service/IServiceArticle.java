package fr.cap.wikimnv.contribution.service;

import fr.cap.wikimnv.exception.MNVException;
import fr.cap.wikimnv.global.domain.pojo.EtatPublication;
import fr.cap.wikimnv.global.service.ICRUDGeneric;

public interface IServiceArticle extends ICRUDGeneric {
	/**
	 * elle permet de changer l'etat de mon article
	 * les �tats possible :<br/>
	 * -Publi� <br/>
	 * -Archiv�<br/>
	 * -Brouillon "�tat initial"
	 * @param etatPublication
	 * @param idArticle
	 */
	void changerEtat (EtatPublication etatPublication, Object idArticle)throws MNVException;

}