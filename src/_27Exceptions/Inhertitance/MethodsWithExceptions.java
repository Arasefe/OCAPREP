package _27Exceptions.Inhertitance;

class NoMoreMeatException extends Exception {               // Checked Exception
}

class NoMorePlantsException extends RuntimeException {       // Unchecked Exception
}

interface Omnivore {
    void eatMeat(int amount) throws NoMoreMeatException;

    void eatPlants(int amount);
}

class Bear implements Omnivore {

    @Override
    public void eatMeat(int amount) throws NoMoreMeatException {
        if (amount <= 0) {
            throw new NoMoreMeatException();
        }

        System.out.println("Eating meat.");
    }

    @Override
    public void eatPlants(int amount) {
        if (amount <= 0) {
            throw new NoMorePlantsException();
        }

        System.out.println("Eating plants");
    }
}

public class MethodsWithExceptions {

    public static void main(String[] args) {
        Bear bear = new Bear();

        try {
            bear.eatMeat(2);
            bear.eatPlants(-2);
        } catch (NoMorePlantsException e) {
            e.printStackTrace();
            System.out.println("No plants");
        } catch (RuntimeException e) {
            System.out.println("Runtime");
        } catch (NoMoreMeatException e) {
            e.printStackTrace();
            System.out.println("Bear is hungry.");
        } finally {
            System.out.println("finally");
        }

        bear.eatPlants(-2);
    }
}
