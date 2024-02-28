package com.dgopadakak.cicdlearning

import org.junit.Assert.assertEquals
import org.junit.Test

class ExampleUnitTest {
    @Test
    fun timesTwo_isCorrect() {
        assertEquals(Multiplier().timesTwo(2), 4)
    }

    @Test
    fun timesThree_isCorrect() {
        assertEquals(Multiplier().timesThree(3), 9)
    }

    @Test
    fun timesFour_isCorrect() {
        assertEquals(Multiplier().timesFour(4), 16)
    }
}