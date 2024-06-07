package com.examen.CalculusRatiocinator.Affirmation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
@Getter
public final class Composee extends Affirmation {
    private final Affirmation left;
    private final Affirmation right;
    private final Conjonction conjonction;

    public Composee(Affirmation left, Affirmation right, Conjonction conjonction) {
        this.left = left;
        this.right = right;
        this.conjonction = conjonction;
    }

    @Override
    public boolean evaluer() {
        switch (conjonction) {
            case et:
                return left.evaluer() && right.evaluer();
            case ou:
                return left.evaluer() || right.evaluer();
            case donc:
                return !left.evaluer() || right.evaluer();
            default:
                throw new IllegalStateException("conjonction non reconue: " + conjonction);
        }
    }
}
