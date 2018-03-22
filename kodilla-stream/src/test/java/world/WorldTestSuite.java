package world;

import com.kodilla.stream.forumuser.world.Continent;
import com.kodilla.stream.forumuser.world.Country;
import com.kodilla.stream.forumuser.world.World;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite{

    @Test
    public void testGetPeopleQuantity(){
        World world = new World("Ziemia");
        Continent europa = new Continent("Europa");
        Continent afryka = new Continent("Afryka");
        Continent azja = new Continent("Azja");

        Country polska = new Country("Polska", new BigDecimal("100"));
        Country  egipt = new Country("Egipt", new BigDecimal("50"));
        Country chiny = new Country("Chiny", new BigDecimal("400"));
        Country niemcy = new Country("Niemcy",new BigDecimal("200"));

        world.addContinent(europa);
        world.addContinent(afryka);
        world.addContinent(azja);

        europa.addCountry(polska);
        europa.addCountry(niemcy);
        azja.addCountry(chiny);
        afryka.addCountry(egipt);

       BigDecimal worldPopulation = world.getPeopleQuantity();
        Assert.assertEquals(new BigDecimal("750"), worldPopulation);

    }
}
