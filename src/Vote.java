import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Vote extends Datos {

    ArrayList<Datos> list = new ArrayList<Datos>();
    HashMap<String, ArrayList<Datos>> items = new HashMap<String, ArrayList<Datos>>();
    public void  vote() {

        String nombre = JOptionPane.showInputDialog("Ingrese nombre del Vote");
        String color = JOptionPane.showInputDialog("Ingrese color del Vote");
        String tamaño = JOptionPane.showInputDialog("Ingrese tamaño del Vote");
        String velocidad = JOptionPane.showInputDialog("Ingrese velocidad del Vote");
        Double peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese peso del Vote"));
        int modelo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese modelo del Vote"));
        this.setAcuaticos(nombre, color, tamaño, velocidad, peso, modelo);
         list.add(this);
         items.put("Acuatico", list);

         mostrarDatos();

    }

    private void mostrarDatos() {
        Iterator<String> it = items.keySet().iterator();

        while (it.hasNext()) {
            String clave = (String) it.next();
            for (int i = 0; i < items.get(clave).size(); i++) {
                 items.get(clave).get(i).getDataAcuaticos();

            }

        }
    }

}
