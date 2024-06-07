package com.examen.CalculusRatiocinator.Affirmation;

import lombok.AllArgsConstructor;
public final class Vraie extends Affirmation{
    protected Vraie(String et, String ou, String donc) {
        super(et, ou, donc);
    }
    public boolean evaluer(){
        return true;
    }
}
