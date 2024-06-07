package com.examen.CalculusRatiocinator.Affirmation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculusRatiocinatorTest {
    @Test
    public void testLouEstBeauEstVraie() {
        Affirmation affirmationLouEstBeau = new Vraie();
        assertEquals("vraie", AffirmationEvaluator.evaluerAffirmation(affirmationLouEstBeau));
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
        assertEquals("vraie", AffirmationEvaluator.evaluerAffirmation(affirmationCompose));
    }

    @Test
    public void testLouEstBeauOuLouEstGénéreuxDoncLouEstPauvre(){
        Affirmation affirmationLouEstBeau = new Vraie();
        Affirmation affirmationLouEstGénéreux = new Vraie();
        Affirmation affirmationLouEstPauvre = new Fausse();

        Affirmation affirmationCompose1 = new Composee(affirmationLouEstBeau,affirmationLouEstGénéreux, Conjonction.ou);
        Affirmation affirmationCompose2 = new Composee(affirmationCompose1,affirmationLouEstPauvre, Conjonction.donc);

        assertEquals("faux",AffirmationEvaluator.evaluerAffirmation(affirmationCompose2));

    }

    @Test
    public void testLouEstBeauOuLouEstGénéreuxDoncLouEstPauvreEtLouEstPauvreOuLouEstGénéreux(){
        Affirmation affirmationLouEstBeau = new Vraie();
        Affirmation affirmationLouEstGénéreux = new Vraie();
        Affirmation affirmationLouEstPauvre = new Fausse();

        Affirmation affirmationCompose1 = new Composee(affirmationLouEstBeau,affirmationLouEstGénéreux, Conjonction.ou);
        Affirmation affirmationCompose2 = new Composee(affirmationCompose1,affirmationLouEstPauvre, Conjonction.donc);
        Affirmation affirmationCompose3 = new Composee(affirmationLouEstPauvre,affirmationLouEstGénéreux, Conjonction.ou);

        Affirmation affirmation1 = new Composee(affirmationCompose2,affirmationCompose3,Conjonction.et);

        assertEquals("faux", AffirmationEvaluator.evaluerAffirmation(affirmation1));

    }
}
