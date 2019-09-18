package generate.fabricMethod.secondExample.client;

import generate.fabricMethod.secondExample.dev.Developer;
import generate.fabricMethod.secondExample.factory.DeveloperFactory;
import generate.fabricMethod.secondExample.factory.JavaDeveloperFactory;
import generate.fabricMethod.secondExample.factory.PhpDeveloperFactory;

//https://www.youtube.com/watch?v=TwIjjTC5g7g
public class Program {
    public static void main(String[] args) {

        DeveloperFactory developerFactory = createDeveloperBySpecialy("java");
        Developer developer = developerFactory.createDeveloper();
        developer.wrideCode();

    }

    public static DeveloperFactory createDeveloperBySpecialy(String specialy){
        if(specialy.equalsIgnoreCase("java")){
            return new JavaDeveloperFactory();
        }
        else if(specialy.equalsIgnoreCase("php")){
            return new PhpDeveloperFactory();
        }
        else{
            throw new RuntimeException(specialy + " not found");
        }
    }
}
