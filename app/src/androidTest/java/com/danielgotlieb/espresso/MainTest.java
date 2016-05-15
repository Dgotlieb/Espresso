package com.danielgotlieb.espresso;

import android.test.ActivityInstrumentationTestCase2;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

/**
 * Created by daniel.gotlieb on 15/05/2016.
 */
public class MainTest extends ActivityInstrumentationTestCase2<MainActivity>
{
    public MainTest() {
        super(MainActivity.class);
    }
    @Override
    public void setUp() throws Exception {
        super.setUp();
        getActivity();
    }
    public void testPhoneIconIsDisplayed() {
        // When the phone_icon view is available,
        // check that it is displayed.
        onView(withId(R.id.button)).check(matches(isDisplayed()));
        onView(withId(R.id.editText)).check(matches(isDisplayed()));

        onView(withId(R.id.editText)).perform(typeText("John"));
        performClick();
//
    }

    private void performClick() {
        onView(withId(R.id.button)).perform(click());


    }


}
