package fr.cap.wikimnv.service.global;

import java.util.Set;

import fr.cap.wikimnv.domaine.pojo.Article;
import fr.cap.wikimnv.domaine.pojo.Etat;
import fr.cap.wikimnv.domaine.pojo.Template;

public interface IGTemplate{
void creer (Template template);
void modifier(Template template);
}
