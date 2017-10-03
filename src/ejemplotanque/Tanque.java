/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplotanque;

/**
 *
 * @author Estudiante
 */
public class Tanque {
    private int x;
    private int y;
    private int angulo;
    private String[] imagenes;
    
    public Tanque(){
        this.x = x;
        this.y = y;
        this.imagenes = new String[18];
        for(int i = 0; i < 18; i++){
            if(i >= 0 || i < 18)
                this.imagenes[i] = i + ".png";
            else if(i < 0){
                i = 0;
                this.imagenes[i] = 1 + ".png";
            } else{
                i = 18;
                this.imagenes[i] = 18 + ".png";
            }
        }
        this.angulo = 1;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getAngulo() {
        return angulo;
    }

    public void setAngulo(int angulo) {
        this.angulo = angulo;
    }

    public String[] getImagenes() {
        return imagenes;
    }

    public void setImagenes(String[] imagenes) {
        this.imagenes = imagenes;
    }
    
    
    
}
