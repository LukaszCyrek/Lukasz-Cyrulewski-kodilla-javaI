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
        Country kamerun = new Country("Kamerun", new BigDecimal("1000"));
        Country japonia = new Country("Japonia", new BigDecimal("600"));
        Country wegry = new Country("Węgry", new BigDecimal("300"));
        Country indie = new Country("Indie", new BigDecimal("100"));
        Country tunezja = new Country("Tunezja", new BigDecimal("50"));

        world.addContinent(europa);
        world.addContinent(afryka);
        world.addContinent(azja);

        europa.addCountry(polska);
        europa.addCountry(niemcy);
        europa.addCountry(wegry);
        azja.addCountry(chiny);
        azja.addCountry(japonia);
        azja.addCountry(indie);
        afryka.addCountry(egipt);
        afryka.addCountry(kamerun);
        afryka.addCountry(tunezja);


       BigDecimal worldPopulation = world.getPeopleQuantity();
        Assert.assertEquals(new BigDecimal("2800"), worldPopulation);

    }
}
