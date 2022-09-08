package espresso;

import static androidx.test.espresso.Espresso.*;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.*;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;

import com.example.moneyconverterapp.MainActivity;
import com.example.moneyconverterapp.R;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;


@RunWith(AndroidJUnit4.class)
@LargeTest
public class EspressoTest {

    @Rule
    public ActivityScenarioRule<MainActivity> activityRule = new ActivityScenarioRule<MainActivity>(MainActivity.class);

    @Test
    public void input_display_checking(){
        onView(withId(R.id.inputText)).check(matches(isDisplayed()));
    }
    @Test
    public void title_display_checking(){
        onView(withId(R.id.outputText)).check(matches(isDisplayed()));
    }
    @Test
    public void image_display_checking(){
        onView(withId(R.id.outputImage)).check(matches(isDisplayed()));
    }
    @Test
    public void potoru_display_checking(){
        onView(withId(R.id.button1)).check(matches(isDisplayed()));
    }
    @Test
    public void potoru_button_checking() {
        onView(withId(R.id.button1)).check(matches(isClickable()));
    }

    @Test
    public void rutodo_display_checking(){
        onView(withId(R.id.button)).check(matches(isDisplayed()));
    }
    @Test
    public void rutodo_button_checking() {
        onView(withId(R.id.button)).check(matches(isClickable()));
    }

    @Test
    public void dotoru_display_checking(){
        onView(withId(R.id.button2)).check(matches(isDisplayed()));
    }
    @Test
    public void dotoru_button_checking() {
        onView(withId(R.id.button2)).check(matches(isClickable()));
    }

    @Test
    public void rutopo_display_checking(){
        onView(withId(R.id.button3)).check(matches(isDisplayed()));
    }
    @Test
    public void rutopo_button_checking() {
        onView(withId(R.id.button3)).check(matches(isClickable()));
    }
}
