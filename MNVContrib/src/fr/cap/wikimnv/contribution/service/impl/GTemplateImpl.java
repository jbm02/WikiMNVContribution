package fr.cap.wikimnv.contribution.service.impl;

import fr.cap.wikimnv.contribution.service.IGTemplate;
import fr.cap.wikimnv.exception.MNVException;
import fr.cap.wikimnv.global.domain.pojo.Template;
import fr.cap.wikimnv.global.service.impl.CrudImpl;


public class GTemplateImpl extends CrudImpl implements IGTemplate {
	
	
	@Override
	public void ajouterMeta(Template template, String metadonnee) throws MNVException {
		template.getMeta().add(metadonnee);
		this.sauver(template);
	}

	@Override
	public void supprimerMeta(Template template, String metadonnee) throws MNVException{
		template.getMeta().remove(metadonnee); 
		this.sauver(template);
	}

}
