package com.examen.CalculusRatiocinator.Affirmation;

import lombok.Data;

@Data
public sealed abstract class Affirmation permits Composee, Fausse, Vraie {
    protected final String et;
    protected final  String ou;
    protected final String donc;

    protected Status status;

    protected Affirmation(String et, String ou, String donc) {
        this.et = et;
        this.ou = ou;
        this.donc = donc;
    }

    public abstract boolean evaluer();
}
