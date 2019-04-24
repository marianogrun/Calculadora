/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import Vista.Vista;

/**
 *
 * @author mgrunbla
 */
public class Controlador {
        private Vista v;
        
    
    public Controlador (){
        
        this.v=new Vista();
        
        
    }
    
    public void iniciar(){
        
        this.v.setVisible(true);
        this.v.setDefaultCloseOperation(this.v.EXIT_ON_CLOSE);
        this.v.setLocationRelativeTo(null);
    }
    
}
