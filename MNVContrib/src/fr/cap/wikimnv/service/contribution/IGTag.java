package fr.cap.wikimnv.service.contribution;

import java.util.Set;

import fr.cap.wikimnv.domain.pojo.Article;
import fr.cap.wikimnv.domain.pojo.Etat;
import fr.cap.wikimnv.domain.pojo.Tag;

public interface IGTag {
	void creer(Tag tag);

	Tag modifier(Tag tag);

	Tag lire(Tag tag);

	Set<Tag> lister();

	void supprimer(Tag tag);
}
