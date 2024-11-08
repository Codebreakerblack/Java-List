package dev.mariel.javalist.servicie;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

public class ManagerWeekDaysTest {

    @Test
    void testCreateList() {
    
        ManagerWeekDays managerWeekDays = new ManagerWeekDays();
        
        assertThat(managerWeekDays.days.size(), is(7));

    }

    @Test
    void testgetDays() {

        ManagerWeekDays managerWeekDays = new ManagerWeekDays();

        assertThat(managerWeekDays.getDays().get(1), is("Martes"));

    }

}
