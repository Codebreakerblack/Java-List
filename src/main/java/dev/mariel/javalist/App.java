package dev.mariel.javalist;

import dev.mariel.javalist.servicie.ManagerWeekDays;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        ManagerWeekDays managerWeekDays = new ManagerWeekDays();
        managerWeekDays.render();
    }
}
