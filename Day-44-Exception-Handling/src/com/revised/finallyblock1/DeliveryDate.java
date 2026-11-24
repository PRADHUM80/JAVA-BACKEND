package com.revised.finallyblock1;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class DeliveryDate {
    public static void main(String[] args) 
    {
        String input = "2029-11-18";

        try 
        {
            LocalDate date = LocalDate.parse(input);
            System.out.println("Delivery date: " + date);
        } 
        catch (DateTimeParseException e)
        {
            System.out.println("Please enter a valid date in YYYY-MM-DD format.");
        }
        finally
        {
            System.out.println("Date check finished.");
        }
    }
}