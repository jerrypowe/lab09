package lab09;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tam Pham
 */
public class Carp {
private String pond;
private int state;

    public Carp() {
    }

    public Carp(String pond, int state) {
        this.pond = pond;
        this.state = state;
    }

    public String getPond() {
        return pond;
    }

    public void setPond(String pond) {
        this.pond = pond;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

public String printData(){
    return String.format("(%s,%d)",pond,state);
}
}
