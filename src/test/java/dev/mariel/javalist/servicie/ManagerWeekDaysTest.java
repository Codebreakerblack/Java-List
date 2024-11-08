package dev.mariel.javalist.servicie;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;

public class ManagerWeekDaysTest {

    @Test
    void testCreateList() {
    
        ManagerWeekDays managerWeekDays = new ManagerWeekDays();
        
        assertThat(managerWeekDays.days.size(), is(7));
    }

    @Test
    void testGetDays() {

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

    @Test
    void testExtractDay() {

        ManagerWeekDays managerWeekDays = new ManagerWeekDays();

        assertEquals("Jueves", managerWeekDays.extractDay(3));
        
    }

    @Test
    void testExistsDay() {

        ManagerWeekDays managerWeekDays = new ManagerWeekDays();

        assertTrue(managerWeekDays.existsDay("Viernes"));
    }

    @Test
    public void testSortList() {

        ManagerWeekDays managerWeekDays = new ManagerWeekDays();

        List<String> sortedDays = managerWeekDays.getDays();

        assertEquals("Sabado", sortedDays.get(5));
    }
}
