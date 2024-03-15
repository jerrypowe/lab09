/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab09;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tam Pham
 */
public class MyCarp implements ICarp{

    @Override
    public int f1(List<Carp> t) {
        int n=0;
        ArrayList<String> s = new ArrayList<>();
        for (Carp carp : t) {
            String regex = "\\p{L}\\d\\p{L}";
           if( carp.getPond().charAt(1)>='0'&& carp.getPond().charAt(1)<='9'){
               n ++;
           }
        }
     return n;
    }

    @Override
    public void f2(List<Carp> t) {
        ArrayList<String> s = new ArrayList<>();
       for (Carp carp : t) {
            String reverse ="";
            for (int i = carp.getPond().length()-1; i >= 0; i--) {
                    reverse += carp.getPond().charAt(i); 
                    }
            if(carp.getPond().equalsIgnoreCase(reverse)) {
                carp.setState(99); 
                break;}       
            
            
        }
    }

    @Override
    public void f3(List<Carp> t) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                int a = t.get(i).getState();
                int b = t.get(j).getState();
                
                if(a>b){
                    t.get(i).setState(b);
                    t.get(j).setState(a);
                }
            }
        }
            }
    
}
