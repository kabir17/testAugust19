package abstractionPractice;

public class People extends Teenage  implements Baby{

    public void respect(){
        System.out.println("People should respect each other");
    }
    public void justBorn(){
        System.out.println("Just born a boy baby!");
    }

    public void boyBaby(){
        System.out.println("Boy baby is not screaming");
    }
    public void young(){
        System.out.println("One day this boy baby will become young");
    }
}
