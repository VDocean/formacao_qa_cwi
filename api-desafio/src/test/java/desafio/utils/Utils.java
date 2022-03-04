package desafio.utils;

public class Utils {
    public static String getSchemaBasePath(String pack, String nameSchema){
        return System.getProperty("user.dir") // aqui fala que quando ele for buscar as propriedades do sistema devera
                // ir na pasta user.dir
                +"/src/test/java/desafio/tests/"
                +pack
                +"/schema/"
                +nameSchema
                + ".json";
    }
}
