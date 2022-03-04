package desafio.runner;

import desafio.tests.auth.tests.PostAuthTest;
import desafio.tests.ping.tests.GetPingTest;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)// aqui digo que ela ira rodar as suites de testes, de acordo com as categorias
//que eu passar para ela
@Categories.IncludeCategory(desafio.suites.AllTests.class)//inclui a categoria que ira fazer parte dessa classe
@Suite.SuiteClasses({
        PostAuthTest.class,
        GetPingTest.class

})

public class AllTests {


}
