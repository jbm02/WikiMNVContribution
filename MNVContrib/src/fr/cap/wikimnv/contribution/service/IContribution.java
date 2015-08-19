package fr.cap.wikimnv.contribution.service;

import fr.cap.wikimnv.exception.MNVException;

public interface IContribution {
	IGArticle getGArticle() throws MNVException;

	IGTag getGTag() throws MNVException;

	IGTemplate getTemplate() throws MNVException;
}
