
package SpitalRoz;

import java.util.logging.Level;
import java.util.logging.Logger;

abstract class Asistent {
    private String nume;
    private int varsta;
    private String gen;
    private static final Logger LOGGER = Logger.getLogger(Asistent.class.getName());

    public Asistent(String nume, int varsta, String gen) {
        this.nume = nume;
        this.varsta = varsta;
        this.gen = gen;
        LOGGER.log(Level.INFO, "Asistent creat: Nume - " + nume + ", Varsta - " + varsta + ", Gen - " + gen);
    }

    public abstract void performTask(); //

    public String getNume() {
        LOGGER.log(Level.INFO, "getNume()   " + this.nume);
        return nume;
    }

    public int getVarsta() {
        LOGGER.log(Level.INFO, "getVarsta()  " + this.nume);
        return varsta;
    }

    public String getGen() {
        LOGGER.log(Level.INFO, "getGen() " + this.nume);
        return gen;
    }
}