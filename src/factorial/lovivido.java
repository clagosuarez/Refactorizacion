/*
 * Examen Refactorizacion
 * 
 */
package factorial;

import javax.swing.JOptionPane;

public class lovivido {

    public static void main(String[] args) {
        String nombre;
        String edad;

        int meses;
        int dias;
        int horas;
        int anhos;

        nombre = JOptionPane.showInputDialog("Escriba su nombre: ");
        edad = JOptionPane.showInputDialog("Escriba su edad: ");

        anhos = Integer.parseInt(edad);

        meses = (anhos * 12);
        dias = (anhos * 365);
        horas = (dias * 24);

        JOptionPane.showMessageDialog(null, "Meses: " + meses, "Numero de meses vividos de " + nombre, JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null, "Días: " + dias, "Numero de días vividos de " + nombre, JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null, "Horas: " + horas, "Numero de horas vividos de " + nombre, JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);

    }

}
