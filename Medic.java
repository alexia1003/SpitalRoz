package SpitalRoz;

public class Medic extends Logger implements IActMedical  {
    private String nume;
    private String prenume;
    private String ID;
    private int varsta;
    private String sectie;
    private String sefSectie;


    // Constructor 1
    public Medic(String nume, String prenume, String ID, int varsta, String sectie) {
        this.nume = nume;
        this.prenume = prenume;
        this.ID = ID; 
        this.varsta = varsta;
        this.sectie = sectie;
    }

    // Constructor 2
    public Medic(String nume, String prenume, String ID, int varsta, String sectie, String sefSectie) {
        this.nume = nume;
        this.prenume = prenume;
        this.ID = ID; 
        this.varsta = varsta;
        this.sectie = sectie;
        this.sefSectie = sefSectie;
    }

    // Constructor 3 ~ noua inst., copiere val. din ex.
    public Medic(Medic exemplu) {
        this.nume = exemplu.nume;
        this.prenume = exemplu.prenume;
        this.ID = exemplu.ID;
        this.varsta = exemplu.varsta;
        this.sectie = exemplu.sectie;
    }
    
    // Metoda toString() 
   // @Override
    public String toString() {
    return "Medic{" +
            "nume: '" + nume + '\'' +
            ", prenume: " + prenume +
            ", ID: " + ID +
            ", varsta: " + varsta +
            ", sectie: " + sectie +
            '}';
    }

    // Accesare campuri private
    // Getter pt nume
    public String getNume() {
        return nume;
    }
    // Getter pt nume
    public String getPreume() {
        return prenume;
    }
    // Getter pt ID
    public String getID() {
        return ID;
    }
    // Getter pt varsta
    public int getVarsta() {
        return varsta;
    }
    // Getter pt sectie
    public String getSectie() {
        return sectie;
    }
    
    // Setare campuri private
    // Setter pt nume
    public void setNume(String nume) {
        this.nume = nume;
    }
    // Setter pt nume
    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }
    // Setter pt ID
    public void ID(String ID) {
        this.ID = ID;
    }
    // Setter pt varsta
    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }
    // Setter pt sectie
    public void setSectie(String sectie) {
        this.sectie = sectie;
    }

    public void operatieRealizata() {
       
        Logger.log("."); //
    }

    public static void main(String[ ] args) {
        //Medic h = new Medic();

        
        System.out.println("HI");
        

    }

}