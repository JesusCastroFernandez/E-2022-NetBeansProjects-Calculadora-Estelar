/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora.estelar;

/**
 *
 * @author JESUS
 */
public class CalculadoraEstelar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        // Universo
        
        long filamentos = 15;
        
         System.out.println("Datos del Universo");
         System.out.println("--------------------------");
         System.out.println("En el Universo Observable hay: " + filamentos + " Filamentos Estelares.");
         
        // Super Cúmulos de Galaxia
        
        long superCumulosGalaxias = 200000;
        System.out.println();
        System.out.println("Datos de los Super Cúmulos de Galaxias");
        System.out.println("--------------------------");
        System.out.println("En el Universo Observable hay: " + superCumulosGalaxias + " Super Cúmulos de Galaxias.");
        
        // Cúmulos de Galaxia
        
        long cumulosGalaxias = 200000;
        System.out.println();
        System.out.println("Datos de los Cúmulos de Galaxias");
        System.out.println("--------------------------");
        System.out.println("En el Universo Observable hay: " + cumulosGalaxias + " Cúmulos de Galaxias.");
        
        // Galaxias
        
        long galaxias = 200000;
        System.out.println();
        System.out.println("Datos de las Galaxias");      
        System.out.println("--------------------------");
        System.out.println("En el Universo Observable hay: " + galaxias + " Galaxias.");
        
        // Sistemas Solares o Planetarios
        
        long viaLactea = 300000;
        System.out.println();
        System.out.println("Datos de los Sistemas Solares o Planetarios");
        System.out.println("--------------------------");
        System.out.println("En la Vía Láctea hay: " + viaLactea + " Sistemas Solares.");
        
        // Planetas
        
        int planetasSistemaSolar = 9;
        System.out.println();
        System.out.println("Datos de los Planetas");
        System.out.println("--------------------------");
        System.out.println("En el Sistema Solar hay: " + planetasSistemaSolar + " Planetas");
        
        // El planeta Tierra
        
        int continentes = 5;
        System.out.println();
        System.out.println("Datos del Planeta Tierra");
        System.out.println("--------------------------");
        System.out.println("En el planeta Tierra hay: " + continentes + " Continentes.");
        
        // Análisis de Datos del Universo Observable (1% del Total)
        
        long sistemasSolaresPorGalaxias = viaLactea * galaxias;        
        long GalaxiasPorCumulosGalaxias = galaxias * cumulosGalaxias;  
        long CumulosGalaxiasPorSuperCumulosGalaxias = cumulosGalaxias * superCumulosGalaxias;  
        long superCumulosGalaxiasPorFilamentos = superCumulosGalaxias * filamentos;
        System.out.println();
        System.out.println("Análisis de Datos");
        System.out.println("------------------------");
        System.out.println("Sí hay: " + viaLactea + " Sistemas Solares o Planetarios y " + galaxias + " Galaxias habría: " + sistemasSolaresPorGalaxias + " Sistemas Solares o Planetarios.");
        System.out.println();
        System.out.println("Sí hay: " + galaxias + " Galaxias y " + cumulosGalaxias + " Cúmulos de Galaxias habría: " + GalaxiasPorCumulosGalaxias + " Galaxias.");
        System.out.println();
        System.out.println("Sí hay: " + cumulosGalaxias + " Cúmulos Galaxias y " + superCumulosGalaxias + " Super Cúmulos de Galaxias habría: " + CumulosGalaxiasPorSuperCumulosGalaxias + " Cúmulos de Galaxias.");
        System.out.println();
        System.out.println("Sí hay: " + superCumulosGalaxias + " Super Cúmulos Galaxias y " + filamentos + " Filamentos Estelares habría: " + superCumulosGalaxiasPorFilamentos + " Super Cúmulos de Galaxias.");
    }
    
}
