package Exmple250;

import java.util.Calendar;

public class Current_Date_Time {
    public static void main(String[] args) {
        Calendar cal=Calendar.getInstance();
        System.out.printf("%tB%te,%ty%n",cal,cal,cal);
        System.out.printf("%tl:%tm,%tp%n",cal,cal,cal);
    }
        }
