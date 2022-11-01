import javax.swing.*;

public class Procesos {


    public void procesosData(){
        String menu="";
        menu = "1. Terrestres\n2. Acuaticos\n3. Aereos\n4. Salir";

          int opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));

        switch (opcion){

            case 1:

                Carro viewCarro = new Carro();
                viewCarro.carroData();

                break;
            case 2:
                Vote newBote = new Vote();
                newBote.vote();
                break;
            case 3:
              System.out.println("Aereos");
                    break;
            case 4:
                System.out.println("Salir");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opcion no valida");
                break;
        }



    }


}
