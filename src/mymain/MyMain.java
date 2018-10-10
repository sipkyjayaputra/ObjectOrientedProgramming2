/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mymain;

import java.util.HashMap;

/**
 *
 * @author vitky
 */
public class MyMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HashMap<Integer, String> hm = new HashMap<>();
        
        HashMapClass minuman1 = new HashMapClass();
        HashMapClass minuman2 = new HashMapClass();
        minuman1.minuman(1, "sprite");
        minuman2.minuman(2, "coca-cola");
        hm.put(minuman1.nomor, minuman1.nama);
        hm.put(minuman2.nomor, minuman2.nama);
        
        System.out.print("1. ");
        System.out.println(hm.get(1));
        
    }
    
}
