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
        for (int i = 0; i < t.size() ; i++) {
            String regex = "\\p{L}\\d";
           if( t.get(i).getPond().matches(regex)){
               n ++;
           }
        }
     return n;
    }

    @Override
    public void f2(List<Carp> t) {
        ArrayList<String> s = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String regex = "\"(.)(.?\\\\1)*\"";
            if(t.get(i).getPond().matches(regex)){
                t.get(i).setState(99);
            }
            
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
