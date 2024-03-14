package com.dgopadakak.cicdlearning

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.replaceText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith


/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {

    @Before
    fun cleanEditText() {
        onView(withId(R.id.edit_text_number)).perform(click())  // Нужно ли?
        onView(withId(R.id.edit_text_number)).perform(replaceText(""))
    }

    @Test
    fun clickButtonHome() {
        onView(withId(R.id.button_times_two)).perform(click())
        onView(withId(R.id.text_view_result)).check(matches(withText(R.string.please_enter_a_number_text)))
    }
}