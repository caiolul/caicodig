/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Caio César
 */
public class Distribuidora {//poderia ser pedido ou algo relacionado
    
    ArrayList<Produtos> Pro=new ArrayList();
    // Esse array pega o produto e add na lista 
    
    
    public void AdcionarProduto(Produtos produto){
        Pro.add(produto);
        
    }
    public int MostrarTamanho(Produtos produto){
        return Pro.size();
    }
    public void MostrarProdutos(Produtos produto){
        int i = 0;
        for (Produtos NomeProduto : Pro) {
            System.out.println(NomeProduto.getNomeProduto());
            i++;
        }
    }
    public void MostrarId(Produtos produto){
        int i = 0;
        for (Produtos n : Pro) {
            System.out.println(n.getId());
            i++;
        }
    }

  
    
}
