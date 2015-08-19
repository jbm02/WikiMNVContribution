package fr.cap.wikimnv.service.contribution;

import fr.cap.wikimnv.exception.MNVException;
import fr.cap.wikimnv.service.global.IGArticle;
import fr.cap.wikimnv.service.global.IGTag;

public interface IContribution {
	IGArticle getGArticle() throws MNVException;
	IGTag getGTag() throws MNVException;

}
