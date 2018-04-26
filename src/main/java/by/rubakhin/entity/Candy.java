package by.rubakhin.entity;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@XmlRootElement(name = "Candies")
@XmlType(propOrder = {"name", "energy", "type", "ingredients", "value", "production"})
public class Candy {

    private int id;
    private String name;
    private int energy;
    private List<CandyType> type;
    private Map<String, Integer> ingredients;
    private List<CandyValue> value;
    private String production;

    public Candy() {
    }


    @XmlAttribute
    public int getId() {
        return id;
    }

    @XmlAttribute
    public void setId(int id) {
        this.id = id;
    }

    @XmlAttribute(name = "name")
    public String getName() {
        return name;
    }

    @XmlAttribute(name = "name")
    public void setName(String name) {
        this.name = name;
    }

    @XmlAttribute(name = "energy")
    public int getEnergy() {
        return energy;
    }

    @XmlAttribute(name = "energy")
    public void setEnergy(int energy) {
        this.energy = energy;
    }

    @XmlAttribute(name = "type")
    public List<CandyType> getType() {
        return type;
    }

    @XmlAttribute(name = "type")
    public void setType(List<CandyType> type) {
        this.type = type;
    }

    @XmlAttribute(name = "ingredients")
    public Map<String, Integer> getIngredients() {
        return ingredients;
    }

    @XmlAttribute(name = "ingredients")
    public void setIngredients(Map<String, Integer> ingredients) {
        this.ingredients = ingredients;
    }

    @XmlAttribute(name = "value")
    public List<CandyValue> getValue() {
        return value;
    }

    @XmlAttribute(name = "value")
    public void setValue(List<CandyValue> value) {
        this.value = value;
    }

    @XmlAttribute(name = "production")
    public String getProduction() {
        return production;
    }

    @XmlAttribute(name = "production")
    public void setProduction(String production) {
        this.production = production;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Candy candy = (Candy) o;
        return id == candy.id &&
                energy == candy.energy &&
                Objects.equals(name, candy.name) &&
                Objects.equals(type, candy.type) &&
                Objects.equals(ingredients, candy.ingredients) &&
                Objects.equals(value, candy.value) &&
                Objects.equals(production, candy.production);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, energy, type, ingredients, value, production);
    }

    @Override
    public String toString() {
        return "Candy{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", energy=" + energy +
                ", type=" + type +
                ", ingredients=" + ingredients +
                ", value=" + value +
                ", production='" + production + '\'' +
                '}';
    }
}
