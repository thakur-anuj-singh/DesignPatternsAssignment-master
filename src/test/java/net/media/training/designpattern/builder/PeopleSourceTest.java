package net.media.training.designpattern.builder;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;


/**
 * Created by IntelliJ IDEA.
 * User: path
 * Date: Jul 19, 2011
 * Time: 9:13:33 PM
 * To change this template use File | Settings | File Templates.
 */
public class PeopleSourceTest {

    @Test
    public void TestPeopleXml() {
        List<Person> persons = new ArrayList<Person>();
        Builder builder = new Builder();
        builder.name("Wu")
               .id(25)
               .city("Shanghai")
               .country("China");
        persons.add(builder.build());

        builder.name("Kobayashi")
                .id(200)
                .city("Kanto")
                .country("Japan");
        persons.add(builder.build());

        builder.name("Vasily")
                .id(1)
                .city("Leningrad")
                .country("Russia");
        persons.add(builder.build());

        String actual = PeopleDataSource.getPeopleXml(persons);

        assertEquals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><People number=\"3\"><Person id=\"25\" name=\"Wu\"><Address><City>Shanghai</City><Country>China</Country></Address></Person><Person id=\"200\" name=\"Kobayashi\"><Address><City>Kanto</City><Country>Japan</Country></Address></Person><Person id=\"1\" name=\"Vasily\"><Address><City>Leningrad</City><Country>Russia</Country></Address></Person></People>", actual);
    }
}