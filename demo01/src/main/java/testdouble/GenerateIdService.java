package testdouble;

import java.util.Random;

public class GenerateIdService {

    private Random random = new Random(); // Dependency

    public void setRandom(Random random) {
        this.random = random;
    }

    public String get() {
        int number = random.nextInt(10);
        String id = "XYZ" + number;
        return id;
    }

}
