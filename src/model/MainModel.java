/*
 * File: MainModel.java
 * Author: Szabó Szebasztián
 * Copyright: 2023, Szebi:)
 * Group: SZOFT-I-1-N
 * Date: 2023-04-27
 * Github: https://github.com/SzaboSzebasztian01
 * Licenc: GNU GPL
 */

package model;

public class MainModel {

    public static double calcTime(double length, double push, double turn){
        double time = length / (push * turn);

        return time;
    }
    
}
