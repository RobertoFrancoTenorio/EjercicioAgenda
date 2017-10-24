import java.security.PrivilegedActionException;

public class Contacto {
    private String nombre;
    private String direccion;
    private long telefono;

    public Contacto(String nom, String dir, long tel){
        if (nom.charAt(0) >= 'a' && nom.charAt(0) <='z' ||

            nom.charAt(0) >= 'A' && nom.charAt(0) <='Z')
        {
            this.nombre=nom;
        }
        else
        {
            RuntimeException ex = new IllegalArgumentException("El nombre debe iniciar con una letra");
            throw ex;
        }
        if(dir.isEmpty())
        {
            throw  new IllegalArgumentException("La Direccion esta vacia");
        }
        else
        {
            this.direccion=dir;
        }
    }
}
