package SpitalRoz;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Spital {
    private static Spital instance;
    private static final Logger LOGGER = Logger.getLogger(Spital.class.getName());

    // Constructor privat pt prevenire instantiere din afara clasei
    private Spital() {
    }

    public static synchronized Spital getInstance() {
        if (instance == null) {
            instance = new Spital();
            LOGGER.log(Level.INFO, "Instance spital creata.");
        }
        return instance;
    }

    public void intereneazaPacient(String patientName) {
        LOGGER.log(Level.INFO, "Pacient internat: " + patientName);
    }

    public void externeazaPacient(String patientName) {
        LOGGER.log(Level.INFO, "Pacient externat: " + patientName);
    }

    public static void main(String[ ] args) {
        Spital h = new Spital();

        
        h.intereneazaPacient("Ana");
        h.externeazaPacient("Ana");

    }

}
