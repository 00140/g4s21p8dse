/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g2s21p8dse;

/**
 *
 * @author Ideapad 330
 */
public class G2s21p8dse {

    /**
     * @param args the command line arguments
     */
    private static frmprincipal formulario;
    private static Datos Datos[];
    private static int contador;
    
    public static void main(String[] args) {
        // TODO code application logic here
        formulario=new frmprincipal();
        Datos = new Datos[100];
        for(int i = 0; i<100;i++){
            Datos[i]=new Datos();
        }
        contador=0;
        formulario.setVisible(true);
    }
    public static void guardar(String n,String m,int e){
        Datos[contador].setNombre(n);
        Datos[contador].setMail(m);
        Datos[contador].setEdad(e);
        contador++;
    }
    public static void buscar(String bus){
        for(int j=0;j<Datos.length;j++){
            if(Datos[j].getNombre().equals(bus)){
            formulario.cargadatos(Datos[j]);
        }
        }
    }
}
