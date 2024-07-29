package net.media.training.designpattern.builder;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: path
 * Date: Jul 19, 2011
 * Time: 10:04:03 PM
 * To change this template use File | Settings | File Templates.
 */
public class PeopleDataSource {

    public static String getPeopleXml(List<Person> persons) {
        XMLBuilder root = new XMLBuilder("People")
                .addAttribute("number",String.valueOf(persons.size()));

        String version = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>";
        for(Person person : persons){
            XMLBuilder personObj = new XMLBuilder("Person");
            personObj.addAttribute("id", String.valueOf(person.getId()));
            personObj.addAttribute("name", person.getName());


            XMLBuilder address = new XMLBuilder("Address");
            address.addChild("City").setContent(person.getCity());
            address.addChild("Country").setContent(person.getCountry());
            personObj.addChild(address);
            root.addChild(personObj);
        }
        return version + root.build();
    }
}