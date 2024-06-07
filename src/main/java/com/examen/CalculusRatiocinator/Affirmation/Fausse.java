package com.examen.CalculusRatiocinator.Affirmation;

public final class Fausse extends Affirmation{
    protected Fausse(String et, String ou, String donc) {
        super(et, ou, donc);
    }
    public boolean evaluer(){
        return true;
    }
}
