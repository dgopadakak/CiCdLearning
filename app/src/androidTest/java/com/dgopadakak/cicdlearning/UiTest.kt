package com.dgopadakak.cicdlearning

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.replaceText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
class UiTest {

    @JvmField
    @Rule
    val activityScenarioRule = ActivityScenarioRule(MainActivity::class.java)

    @Before
    fun cleanEditText() {
        onView(withId(R.id.edit_text_number)).perform(replaceText(""))
    }

    @Test
    fun clickButtonsWithEmptyEditText() {
        onView(withId(R.id.button_times_two)).perform(click())
        onView(withId(R.id.text_view_result)).check(matches(withText(R.string.please_enter_a_number_text)))

        onView(withId(R.id.button_times_three)).perform(click())
        onView(withId(R.id.text_view_result)).check(matches(withText(R.string.please_enter_a_number_text)))

        onView(withId(R.id.button_times_four)).perform(click())
        onView(withId(R.id.text_view_result)).check(matches(withText(R.string.please_enter_a_number_text)))
    }

    @Test
    fun clickButtonsWithFullEditText() {
        onView(withId(R.id.edit_text_number)).perform(replaceText("2"))
        onView(withId(R.id.button_times_two)).perform(click())
        onView(withId(R.id.text_view_result)).check(matches(withText("4")))

        onView(withId(R.id.edit_text_number)).perform(replaceText("3"))
        onView(withId(R.id.button_times_three)).perform(click())
        onView(withId(R.id.text_view_result)).check(matches(withText("9")))

        onView(withId(R.id.edit_text_number)).perform(replaceText("4"))
        onView(withId(R.id.button_times_four)).perform(click())
        onView(withId(R.id.text_view_result)).check(matches(withText("16")))
    }
}