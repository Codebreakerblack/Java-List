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

}   
