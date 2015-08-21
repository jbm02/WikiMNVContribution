package fr.cap.wikimnv.contribution.service.impl;

import java.util.Set;

import fr.cap.wikimnv.contribution.service.IGTag;
import fr.cap.wikimnv.domain.pojo.Query;
import fr.cap.wikimnv.domain.pojo.Tag;
import fr.cap.wikimnv.global.service.ICRUD;
import fr.cap.wikimnv.global.service.impl.CrudImpl;


public class GTagImpl implements IGTag {
	ICRUD crud = new CrudImpl();
	
	@Override
	public Set<?> lister(Class cls) {
		return crud.lister(Tag.class);
	}

	@Override
	public Object lire(Object obj, Class cls) {
		return crud.lire(obj, Tag.class);
	}

	@Override
	public Object supprimer(Object obj) {
		return crud.supprimer(obj);
	}

	@Override
	public Object sauver(Object obj) {
		return crud.sauver(obj);
	}

	@Override
	public Set<Tag> rechercheTextuelle(String libelle) {
		return null;
	}

}