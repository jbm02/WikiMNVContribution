package fr.cap.wikimnv.contribution.service.impl;

import fr.cap.wikimnv.contribution.service.IServiceContribution;
import fr.cap.wikimnv.core.commons.exception.MNVException;
import fr.cap.wikimnv.core.pojo.EtatPublication;

public class ServiceContributionImpl<Article> implements IServiceContribution {

	@Override
	public Object sauver(Object article) throws MNVException {
		
		return null;
	}

	@Override
	public boolean demandePublication(Object articleKey) throws MNVException {
		return false;
	}

}
