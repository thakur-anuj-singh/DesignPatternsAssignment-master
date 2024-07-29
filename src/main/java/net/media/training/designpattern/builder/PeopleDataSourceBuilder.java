package net.media.training.designpattern.builder;

import java.util.List;
public class PeopleDataSourceBuilder {
        private List<Person> persons;
        public PeopleDataSourceBuilder setPersons(List<Person> persons) {
            this.persons = persons;
            return this;
        }
        public PeopleDataSource build() {
            return new PeopleDataSource(persons);
        }
}
