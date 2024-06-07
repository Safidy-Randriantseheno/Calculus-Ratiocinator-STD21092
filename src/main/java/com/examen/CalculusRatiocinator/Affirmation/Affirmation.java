package com.examen.CalculusRatiocinator.Affirmation;

import java.io.ObjectInputFilter;

public sealed abstract class Affirmation permits Vraie , Fausse{
    protected final String et;
    protected final  String ou;
    protected final String donc;

    protected Status status;


}
