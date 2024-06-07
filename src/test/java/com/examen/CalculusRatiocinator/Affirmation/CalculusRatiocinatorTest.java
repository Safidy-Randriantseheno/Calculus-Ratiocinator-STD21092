package com.examen.CalculusRatiocinator.Affirmation;

import lombok.AllArgsConstructor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CalculusRatiocinatorTest {
    @Test
    public void testLouEstBeauEstVraie() {
        Affirmation affirmationLouEstBeau = new Vraie();
        assertEquals("vrai", AffirmationEvaluator.evaluerAffirmation(affirmationLouEstBeau));
    }
    @Test
    public void testLouEstBeauDoncLouEstPauvre() {
        Affirmation affirmationLouEstBeau = new Vraie();
        Affirmation affirmationLouEstPauvre = new Fausse();

        Affirmation affirmationComposee = new Composee(affirmationLouEstBeau, affirmationLouEstPauvre, Conjonction.donc);

        assertEquals("faux", AffirmationEvaluator.evaluerAffirmation(affirmationComposee));
    }
    @Test
    public void testLouEstPauvreDoncLouEstGénéreux(){
        Affirmation affirmationLouEstPauvre = new Fausse();
        Affirmation affirmationLouEstGénéreux = new Vraie();

        Affirmation affirmationCompose = new Composee(affirmationLouEstPauvre,affirmationLouEstGénéreux, Conjonction.donc);
        assertEquals("vrai", AffirmationEvaluator.evaluerAffirmation(affirmationCompose));
    }
}
