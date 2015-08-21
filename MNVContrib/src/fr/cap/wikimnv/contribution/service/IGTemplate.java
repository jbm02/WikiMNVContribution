package fr.cap.wikimnv.contribution.service;

import fr.cap.wikimnv.domain.pojo.Template;
import fr.cap.wikimnv.exception.MNVException;
import fr.cap.wikimnv.global.service.ICRUD;


public interface IGTemplate extends ICRUD {
	public void ajouterMeta(Template template,String metadonnee) throws MNVException;
	public void supprimerMeta(Template template,String metadonnee) throws MNVException;
}
