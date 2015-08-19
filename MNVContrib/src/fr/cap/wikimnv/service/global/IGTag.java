package fr.cap.wikimnv.service.global;

import java.util.Set;

import fr.cap.wikimnv.domaine.pojo.Article;
import fr.cap.wikimnv.domaine.pojo.Etat;
import fr.cap.wikimnv.domaine.pojo.Tag;

public interface IGTag{
void creer (Tag tag);
Tag modifier(Tag tag);
Tag lire(Tag tag);
Set<Tag> lister();
void supprimer(Tag tag);
}
