package dev.mariel.javalist.servicie;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertTrue;

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

	@Test
	void testGetLong() {
		
        ManagerWeekDays managerWeekDays = new ManagerWeekDays();

        assertThat(managerWeekDays.getLong(), is(7));
	}

    @Test
    void testDeleteDay() {

        ManagerWeekDays managerWeekDays = new ManagerWeekDays();

        assertTrue(managerWeekDays.deleteDay("Domingo"));
        assertThat(managerWeekDays.getLong(), is(6));   
    }

}
