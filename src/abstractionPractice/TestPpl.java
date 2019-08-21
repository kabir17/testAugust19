package abstractionPractice;

public class TestPpl {

    public static void main(String[] args) {

        People ppl = new People();
        ppl.boyBaby();
        ppl.justBorn();
        ppl.respect();
        ppl.young();

        System.out.println("____________________");

        Baby ppl1 = new People();
        ppl1.justBorn();
        ppl1.boyBaby();

        System.out.println("______________________");

        Teenage ppl2 = new People();
        ppl2.getBig();
        ppl2.young();

    }
}
