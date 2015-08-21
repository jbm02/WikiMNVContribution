package fr.cap.wikimnv.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import fr.cap.wikimnv.test.contribution.service.IGArticleTest;

@RunWith(Suite.class)
@SuiteClasses({ IGArticleTest.class })
public class AllTests {

}
