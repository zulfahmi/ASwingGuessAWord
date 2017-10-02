/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.indocyber.guessgame;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author zulfahmi
 */
public class StringProp {

    public static void main(String[] args) {
        String nama = "Pondok Indah";
        //System.out.println(nama.indexOf('u'));
        //System.out.println(nama.lastIndexOf('o'));
        //nama = nama.replace('i', '_');

        char[] vokal = {'a', 'i', 'u', 'e', 'o'};
        //
        for (int i = 0; i < vokal.length; i++) {
            nama = nama.replace(vokal[i], '_');
        }
        System.out.println(nama);
//        for (int i = 0; i < vokal.length; i++) {
//            if(nama.indexOf(vokal[i]) == -1) {
//                
//            } else {
//               int idx = nama.indexOf(vokal[i]);
//               
//            }
//        }

//        char idx5 = nama.charAt(5);
//        System.out.println(idx5);
//        int uni5 = nama.codePointAt(5); // unicode
//        System.out.println(uni5);
//        
//        int a = 'c';
//        char d = 10009;
//        
//        System.out.println(Character.getNumericValue('R')); //ascii
        List a = new ArrayList();
        a.add(1);
        String emp = " ";
        if(emp.equals(" ")) {
            System.out.println("Kosong");
        }

    }

}
