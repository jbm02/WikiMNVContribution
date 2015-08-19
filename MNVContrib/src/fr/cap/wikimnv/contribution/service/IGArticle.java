package fr.cap.wikimnv.contribution.service;

import java.util.Set;

import fr.cap.wikimnv.domain.pojo.Article;
import fr.cap.wikimnv.domain.pojo.Etat;
import fr.cap.wikimnv.global.service.ICRUD;

public interface IGArticle extends ICRUD {
	void publier (Enum etat);
}
