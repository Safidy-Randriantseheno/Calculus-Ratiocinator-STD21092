package com.examen.CalculusRatiocinator.Affirmation;

import lombok.Data;

@Data
public sealed abstract class Affirmation permits Composee, Fausse, Vraie {
    public abstract boolean evaluer();
}
