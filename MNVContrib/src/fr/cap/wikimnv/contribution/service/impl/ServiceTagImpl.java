package fr.cap.wikimnv.contribution.service.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import fr.cap.wikimnv.contribution.service.IServiceTag;
import fr.cap.wikimnv.exception.MNVException;
import fr.cap.wikimnv.global.domain.pojo.Query;
import fr.cap.wikimnv.global.domain.pojo.Tag;
import fr.cap.wikimnv.global.service.ICRUD;
import fr.cap.wikimnv.global.service.impl.CrudImplBouchon;

public class ServiceTagImpl implements IServiceTag {

	ICRUD crud = new CrudImplBouchon();
	
	@Override
	public Set<?> lister(Class cls) throws MNVException {
		return crud.lister(Tag.class);
	}

	@Override
	public Object lire(Object obj, Class cls) throws MNVException {
		return crud.lire(obj, Tag.class);
	}

	@Override
	public Object supprimer(Object obj) throws MNVException {
		return crud.supprimer(obj);
	}

	@Override
	public Object sauver(Object obj) throws MNVException {
		return crud.sauver(obj);
	}

	@Override
	public Set<Tag> rechercheTextuelle(String libelle) throws MNVException {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("pTexte", libelle);
		return (Set<Tag>) crud.faireRequete(Query.TAG_RECHERCHETEXTUELLE, params);
		
	}
	
	
}
