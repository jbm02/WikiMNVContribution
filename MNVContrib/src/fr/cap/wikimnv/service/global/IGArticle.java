package fr.cap.wikimnv.service.global;

import java.util.Set;

import fr.cap.wikimnv.domaine.pojo.Article;
import fr.cap.wikimnv.domaine.pojo.Etat;

public interface IGArticle {
void creer(Article article);
Set<Article> lister ();
Article lire(Object id);
Article versionning(Article article);
Article modifier (Object id);
void supprimer (Object id);
void changerEtat(Etat etat,int id);
}
