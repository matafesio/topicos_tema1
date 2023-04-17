package TDA;

public class Alumno {
    private String NumC;
    private String NomAlum;
    private byte SemAlum;
    private byte EdadAlum;

    public Alumno() {
    }

    public Alumno(String NumC, String NomAlum, byte SemAlum, byte EdadAlum) {
        this.NumC = NumC;
        this.NomAlum = NomAlum;
        this.SemAlum = SemAlum;
        this.EdadAlum = EdadAlum;
    }

    public void setNumC(String NumC) {
        this.NumC = NumC;
    }

    public void setNomAlum(String NomAlum) {
        this.NomAlum = NomAlum;
    }

    public void setSemAlum(byte SemAlum) {
        this.SemAlum = SemAlum;
    }

    public void setEdadAlum(byte EdadAlum) {
        this.EdadAlum = EdadAlum;
    }

    public String getNumC() {
        return NumC;
    }

    public String getNomAlum() {
        return NomAlum;
    }

    public byte getSemAlum() {
        return SemAlum;
    }

    public byte getEdadAlum() {
        return EdadAlum;
    }

    @Override
    public String toString() {
        return "Alumno{" + "NumC=" + NumC + ", NomAlum=" + NomAlum + ", SemAlum=" + SemAlum + ", EdadAlum=" + EdadAlum + '}';
    }
    
}