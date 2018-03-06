package com.kodilla.patterns.singleton;

import com.kodilla.patterns.singleton.Logger;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {
    private static Logger logger;

@BeforeClass
public static void LogIn (){
    logger =new Logger();
    logger.getInstance().log("Marek Marecki");
}

@Test
    public void testGetLastLog() {
String lastLog = logger.getInstance().getLastLog();
System.out.println("logged: " + lastLog);
    Assert.assertEquals("Marek Marecki", lastLog);
}
}
