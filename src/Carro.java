import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Carro extends Datos {

    protected String placa;
    ArrayList<Datos> list = new ArrayList<Datos>();
    HashMap<String, ArrayList<Datos>> items = new HashMap<String, ArrayList<Datos>>();
    public void carroData() {


        String nombre = JOptionPane.showInputDialog("Ingrese nombre del     Carro");
        String color = JOptionPane.showInputDialog("Ingrese color del Carro");
        String tamaño = JOptionPane.showInputDialog("Ingrese tamaño del Carro");
        String velocidad = JOptionPane.showInputDialog("Ingrese velocidad del Carro");
        Double peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese peso del Carro"));
        this.placa = JOptionPane.showInputDialog("Ingrese la placa del Carro");
        int modelo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese modelo del Carro"));
        this.setAcuaticos(nombre, color, tamaño, velocidad, peso, modelo);
        list.add(this);
        items.put("Terrestre", list);

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
