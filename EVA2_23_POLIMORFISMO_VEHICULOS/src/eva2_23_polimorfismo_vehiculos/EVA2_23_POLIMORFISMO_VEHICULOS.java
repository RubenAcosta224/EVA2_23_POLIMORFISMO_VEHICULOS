/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_23_polimorfismo_vehiculos;

/**
 *
 * @author invitado
 */
public class EVA2_23_POLIMORFISMO_VEHICULOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Automovil auto=new Automovil("Tsuru", 1999, 0, "Nissan");
//        auto.acelerar(50);
//        auto.tablero();
        
        Bicicleta bici=new Bicicleta("2 ruedas?", "2", 0, "Siu");
//        bici.acelerar(10);
//        bici.tablero();
        
        
        cambiarVelocidad(auto, 50);
        cambiarVelocidad(bici, 10);
        
        
        
    }
    
    public static void cambiarVelocidad(DatosVehiculo vehi ,int vel){
        vehi.acelerar(vel);
        vehi.tablero();
        
    }
    
}


interface DatosVehiculo{
    void acelerar(int cambio);
    void tablero();
    
}

class Vehiculo{
    protected int velocidad;
    private String marca;
    
        public Vehiculo() {
        this.velocidad = 0;
        this.marca ="---";
    }

    public Vehiculo(int velocidad, String marca) {
        this.velocidad = velocidad;
        this.marca = marca;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    
}

class Automovil extends Vehiculo implements DatosVehiculo{
    
    private String modelo;
    private int ao;

    
    public Automovil() {
        super();
        this.modelo = "---";
        this.ao = 0;
    }

    public Automovil(String modelo, int ao, int velocidad, String marca) {
        super(velocidad, marca);
        this.modelo = modelo;
        this.ao = ao;

    }





    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAo() {
        return ao;
    }

    public void setAo(int ao) {
        this.ao = ao;
    }

    @Override
    public void acelerar(int cambio) {
        int cambioVe=velocidad+cambio;
        if(cambioVe>=0){
            velocidad=cambioVe;
            
        }
    }

    @Override
    public void tablero() {
        System.out.println("Velocidad automovil: "+velocidad);
    }
    
    
}

class Bicicleta extends Vehiculo implements DatosVehiculo{
    private String tipo;
    private String rodada;

    public Bicicleta() {
        super();
        this.tipo = "--";
        this.rodada = "--";
    }

    public Bicicleta(String tipo, String rodada, int velocidad, String marca) {
        super(velocidad, marca);
        this.tipo = tipo;
        this.rodada = rodada;
    }
    
    @Override
    public void acelerar(int cambio) {
        int cambioVe=velocidad+cambio;
        if(cambioVe>=0){
            velocidad=cambioVe;
            
        }
    }

    @Override
    public void tablero() {
        System.out.println("Velocidad bicicleta: "+velocidad);
    }
    
}