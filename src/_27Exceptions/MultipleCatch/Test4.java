package _27Exceptions.MultipleCatch;

class MuseumClosed extends RuntimeException {
}

class MuseumClosedForLunch extends MuseumClosed {
}

public class Test4 {
    public static void main(String[] args) {
        try {
            visitMuseum();
        } catch (MuseumClosedForLunch mc) {         // subclass of MuseumClosed
            System.out.println("Closed for lunch coma back in 2 hours");
        } catch (MuseumClosed mc) {                 // subclass of RunTimeException
            System.out.println("Closed");
        } catch (RuntimeException e) {              // Superclass
        System.out.println("Runtime exception");
        }
        System.out.println("DONE");
    }

    public static void visitMuseum() {
        boolean b = Math.random() < 1;

        if (b) {
            throw new MuseumClosed();
        }

        throw new MuseumClosedForLunch();
    }
}
