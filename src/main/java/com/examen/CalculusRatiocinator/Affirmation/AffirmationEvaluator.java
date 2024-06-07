package com.examen.CalculusRatiocinator.Affirmation;

public class AffirmationEvaluator {
    public static String evaluerAffirmation(Affirmation affirmation) {
        try {
            boolean resultat = affirmation.evaluer();
            return resultat ? "vraie" : "faux";
        } catch (Exception e) {
            return "jenesaispas";
        }
    }
}
