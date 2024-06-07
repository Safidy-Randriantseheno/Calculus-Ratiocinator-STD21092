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

}
