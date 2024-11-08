package dev.mariel.javalist.servicie;

import java.util.ArrayList;
import java.util.List;

public class ManagerWeekDays {

    public List<String>days;

    public ManagerWeekDays(){
        createList();
    }
    
    public void createList() {
        days = new ArrayList<>();
        days.add("Lunes");
        days.add("Martes");
        days.add("Miercoles");
        days.add("Jueves");
        days.add("Viernes");
        days.add("Sabado");
        days.add("Domingo");
    }
    
    public List<String> getDays() {
        return new ArrayList<>(days);
    }

    public int getLong(){
        return days.size();
    }

    public boolean deleteDay(String days) {
        return this.days.remove(days);
    }

    public String extractDay(int indice) {
        if (indice >= 0 && indice < days.size()) {
            return days.get(indice);   
        }
        return null;
    }

    public boolean existsDay (String days) {
        return this.days.contains(days);
    }

    public void sortList() {
        days.sort(String::compareToIgnoreCase);
    }

    public void emptyrList() {
        days.clear();
    }

}   
