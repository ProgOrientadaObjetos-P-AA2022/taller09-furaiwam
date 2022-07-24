package paquete2;

public class Persona {
    private String nom;
    private String ap;
    private String username;

    public Persona(String n, String ape, String user) {
        nom = n;
        ap = ape;
        username = user;
    }

    public void establecerNom(String n) {
        nom = n;
    }

    public void establecerAp(String n) {
        ap = n;
    }

    public void establecerUser(String n) {
        username = n;
    }

    public String obtenerNom() {
        return nom;
    }

    public String obtenerAp() {
        return ap;
    }

    public String obtenerUser() {
        return username;
    }

    @Override
    public String toString() {
        String cadena = String.format("%s - %s - %s\n",
                nom, ap, username);
        return cadena;
    }
}
