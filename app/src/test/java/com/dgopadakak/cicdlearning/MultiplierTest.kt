package com.dgopadakak.cicdlearning

import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class MultiplierTest {

    private lateinit var multiplier: Multiplier

    @Before
    fun setUp() {
        multiplier = Multiplier()
    }

    @Test
    fun timesTwo_isCorrect() {
        assertEquals(multiplier.timesTwo(2), 4)
    }

    @Test
    fun timesThree_isCorrect() {
        assertEquals(multiplier.timesThree(3), 9)
    }

    @Test
    fun timesFour_isCorrect() {
        assertEquals(multiplier.timesFour(4), 16)
    }
}