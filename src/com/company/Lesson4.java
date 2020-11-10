package com.company;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Lesson4 {
    // TODO arvuta kasutades BigDecimali 1.89 * ((394486820345 / 15 ) + 4 )
    public static void main(String[] args) {

        BigDecimal a = new BigDecimal(1.89f);
        BigDecimal b = new BigDecimal("394486820345");
        BigDecimal c = new BigDecimal("15");
        BigDecimal d = new BigDecimal("4");

        BigDecimal e = a.multiply(b.divide(c, RoundingMode.HALF_DOWN).add(d));

        System.out.println(e);


    }



/*
        public static void yl2(){
        // TODO loo float muutuja ja väärtusta see 1.89
        // TODO korruta see läbi täisarvuga 11
        // TODO trüki tulemus välja
        // TODO nüüd tee seda kasutades klassi BigDecimal ja võrdle tulemust
    }*/


}


