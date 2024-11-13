package CONTRAS;
import java.security.SecureRandom;

public class GenerarContras {
    public static void main(String[] args) {
        int longitud = 12; // Longitud de la contraseña
        String contraseña = generarContraseña(longitud);
        System.out.println("Contraseña generada: " + contraseña);
    }

    public static String generarContraseña(int longitud) {
        // Definir los caracteres permitidos
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()-_";
        SecureRandom random = new SecureRandom();
        StringBuilder contraseña = new StringBuilder(longitud);

        // Generar la contraseña aleatoria
        for (int i = 0; i < longitud; i++) {
            int index = random.nextInt(caracteres.length());
            contraseña.append(caracteres.charAt(index));
        }

        return contraseña.toString();
    }
}
