package com.examen.CalculusRatiocinator.Affirmation;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public final class Vraie extends Affirmation{
    public boolean evaluer(){
        return true;
    }
}
