/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Caio César
 */
public class Projeto {// Troque o nome por distribuidora 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec= new Scanner(System.in);
        Produtos[] p=new Produtos[](); 
        Distribuidora d1=new Distribuidora();
        ArrayList<Produtos>Pro=new ArrayList();
        
       
        //TODO 
           
        
         d1.MostrarProdutos(p);
        System.out.println(d1.MostrarTamanho(p1));
        d1.MostrarId(p1);           
    }
    
}
