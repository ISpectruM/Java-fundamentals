package A_DefineClasses.I_Google;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private Company company;
    private List<Pokemon> pokemons;
    private List<Parent> parents;
    private List<Children> children;
    private Car car;

    public Person(String name){
        this.name = name;
        this.pokemons = new ArrayList<>();
        this.parents = new ArrayList<>();
        this.children = new ArrayList<>();
    }

    public List<Pokemon> getPokemons() {
        return this.pokemons;
    }

    public void addPokemnon(Pokemon pokemon){
        this.pokemons.add(pokemon);
    }

    public List<Parent> getParents() {
        return this.parents;
    }

    public void addParent(Parent parent) {
        this.parents.add(parent);
    }

    public List<Children> getChildren() {
        return this.children;
    }

    public void addChild (Children children){
        this.children.add(children);
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Company getCompany() {
        return this.company;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public String getName() {
        return name;
    }

    public Car getCar() {
        return car;
    }
}
