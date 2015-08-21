package fr.cap.wikimnv.contribution.service;

import java.util.Set;

import fr.cap.wikimnv.domain.pojo.Tag;
import fr.cap.wikimnv.global.service.ICRUD;


public interface IGTag extends ICRUD{
	
	/**
	 * Liste les tags contenant le texte sélectionné.
	 * @param setTag
	 * @param libelle
	 * @return
	 */
	Set<Tag> rechercheTextuelle(String libelle);
}

