interface PG {
    void accomodationType();
}

class GirlsPG implements PG {

    @Override
    public void accomodationType() {
        System.out.println("Girls PG");
    }
}

class BoysPG implements PG {

    @Override
    public void accomodationType() {
        System.out.println("Boys PG");
    }
}

class CoedPG implements PG {

    @Override
    public void accomodationType() {
        System.out.println("Coed PG");
    }
}

interface PGFactory {
    PG createPG();
}

class GirlsPGFactory implements PGFactory {
    @Override
    public PG createPG() {
        return new GirlsPG();
    }
}

class BoysPGFactory implements PGFactory {
    @Override
    public PG createPG() {
        return new BoysPG();
    }
}

class CoedPGFactory implements PGFactory {
    @Override
    public PG createPG() {
        return new CoedPG();
    }
}

public class FactoryMethod {
    public static void main(String[] args) {
        PGFactory pg1 = new GirlsPGFactory();
        PG girlsPg = pg1.createPG();
        girlsPg.accomodationType();

        PGFactory pg2 = new BoysPGFactory();
        PG boysPg = pg2.createPG();
        boysPg.accomodationType();

        PGFactory pg3 = new CoedPGFactory();
        PG coedPg = pg3.createPG();
        coedPg.accomodationType();

    }
}