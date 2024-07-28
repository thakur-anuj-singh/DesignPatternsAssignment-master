package net.media.training.designpattern.builder;

public class Builder {
    private String name;
    private int id;
    private String city;
    private String country;

    public Builder name(String name){
        this.name = name;
        return this;
    }
    public Builder id(int id){
        this.id = id;
        return this;
    }
    public Builder city(String city){
        this.city = city;
        return this;
    }
    public Builder country(String country){
        this.country = country;
        return this;
    }
    public Person build(){
        return new Person(name,id,city,country);
    }
}
