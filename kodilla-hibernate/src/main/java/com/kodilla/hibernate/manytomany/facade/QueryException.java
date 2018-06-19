package com.kodilla.hibernate.manytomany.facade;

public class QueryException extends Exception {

    public static String ERR_INVALID_TEXT = "Provided text is not valid";
    public static String ERR_COMPANY_SEARCH = "Company does not exist";
    public static String ERR_EMPLOYEE_SEARCH = "Employee does not exist";

    public QueryException(String message) {
        super(message);
    }
}
