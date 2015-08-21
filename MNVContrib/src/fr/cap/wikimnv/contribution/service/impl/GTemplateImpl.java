package fr.cap.wikimnv.contribution.service.impl;

import fr.cap.wikimnv.contribution.service.IGTemplate;
import fr.cap.wikimnv.domain.pojo.Template;
import fr.cap.wikimnv.global.service.impl.CrudImpl;


public class GTemplateImpl extends CrudImpl implements IGTemplate {

	@Override
	public void ajouterMeta(Template template, String metadonnee) {
		template.getMeta().add(metadonnee);
	}

	@Override
	public void supprimerMeta(Template template, String metadonnee) {
		// TODO Auto-generated method stub
		template.getMeta().remove(metadonnee); 
		
	}

}
