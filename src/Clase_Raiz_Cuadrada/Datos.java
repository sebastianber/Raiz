package Clase_Raiz_Cuadrada;

public class Datos {
    
    double valor;
    double resultado;
    
    public void setDatos(double Nraiz){
        this.valor=Nraiz;
   } 

    public double getRaiz(){
        resultado = Math.sqrt(valor);
        return this.resultado;
    }
}

