package fr.cap.wikimnv.contribution.service;

import fr.cap.wikimnv.exception.MNVException;

public interface IServiceContribution {
	IServiceArticle getGArticle() throws MNVException;

	IServiceTag getGTag() throws MNVException;

	IServiceTemplate getTemplate() throws MNVException;
}
