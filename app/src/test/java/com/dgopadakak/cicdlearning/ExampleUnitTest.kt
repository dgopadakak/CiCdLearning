package com.dgopadakak.cicdlearning

import org.junit.Assert.assertEquals
import org.junit.Test

class ExampleUnitTest {
    @Test
    fun timesTwo_isCorrect() {
        assertEquals(Multiplier().timesTwo(2), 4)
    }
}