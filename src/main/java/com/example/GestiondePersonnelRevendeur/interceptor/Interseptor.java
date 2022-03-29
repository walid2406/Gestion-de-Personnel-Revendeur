package com.example.GestiondePersonnelRevendeur.interceptor;

import org.hibernate.EmptyInterceptor;

public class Interseptor extends EmptyInterceptor {


    @Override
    public String onPrepareStatement(String sql) {
        //System.out.println(sql);
        //todo part 26 @48:00
        //add sql modification
        return super.onPrepareStatement(sql);
    }


}
