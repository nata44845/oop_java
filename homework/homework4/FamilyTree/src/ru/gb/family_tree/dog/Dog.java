package ru.gb.family_tree.dog;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

import ru.gb.family_tree.gender.Gender;
import ru.gb.family_tree.tree.TreeItem;

public class Dog implements Serializable, TreeItem {
    private int id;
    private String firstName;
    private LocalDate birthDate;
    private LocalDate deathDate;
    private Gender gender; 
    private Dog father, mother;
    private List<Dog> children;

    public Dog() {
        children = new ArrayList<>();
    }

    public Dog(String firstName) {
        this(firstName,null,null);
    }

    public Dog(String firstName, LocalDate birthDate) {
        this(firstName,birthDate,null);
    }

    public Dog(String firstName, LocalDate birthDate, Gender gender) {
        this(firstName, birthDate,null,gender,null,null);
    }

    public Dog(String firstName, LocalDate birthDate, LocalDate deathDate, Gender gender) {
    this(firstName,birthDate,deathDate,gender,null,null);
}

    public Dog(String firstName, LocalDate birthDate, LocalDate deathDate,
                Gender gender, Dog father, Dog mother) {
        this();
        this.firstName = firstName;
        this.birthDate = birthDate;
        this.deathDate = deathDate;
        this.gender = gender;
        setFather(father);
        setMother(mother);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public LocalDate getDeathDate() {
        return deathDate;
    }

    public void setDeathDate(LocalDate deathDate) {
        this.deathDate = deathDate;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Dog getFather() {
        return father;
    }

    public void setFather(Dog father) {
        if (father != null && !(father.children.contains(this))) {
            this.father = father;
            if (father != null) father.addChild(this,Gender.Male);
        }
    }

    public Dog getMother() {
        return mother;
    }

    public void setMother(Dog mother) {
        if (mother != null && !(mother.children.contains(this))) {
            this.mother = mother;
            if (mother != null) mother.addChild(this,Gender.Female);
        }
    }

    public List<Dog> getChildren() {
        return children;
    }

    private void addChild(Dog dog, Gender sex) {
        if (!this.children.contains(dog)) {
            this.children.add(dog);
            if (this.gender != null) {
                if (this.gender == Gender.Male) 
                    dog.setFather(this);
                else 
                    dog.setMother(this);
            } else {
                if (sex == Gender.Male) 
                    dog.setFather(this);
                else 
                    dog.setMother(this);
            }
        }
    }

    public void setChildren(List<Dog> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%d %s", id, firstName));
        if (birthDate != null) 
            sb.append(String.format(", дата рождения %s", birthDate));
        if (deathDate != null) 
            sb.append(String.format(", дата смерти %s", deathDate));
        if (gender != null) 
            sb.append(String.format(", %s", gender));
        if (getDeathAge() != null) 
            sb.append(String.format(", умер в %d лет", getDeathAge()));
        return sb.toString();
    }

    public String getFullInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append(this);
        if (this.father != null) 
        sb.append(String.format("\nОтец: %s",this.father));
        if (this.mother != null) 
        sb.append(String.format("\nМать: %s",this.mother));
        sb.append("\n------------------------");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Dog)) return false;
        Dog dog = (Dog)obj;
        //System.out.println(dog.getFirstName()+dog.getMiddleName()+dog.getLastName()+dog.getBirthDate());
        return (dog.getFirstName()+dog.getBirthDate()).
        equals(getFirstName()+getBirthDate());
    }

    public Integer getDeathAge() {
        if (birthDate != null && deathDate != null)
            return Period.between(birthDate, deathDate).getYears();
        else 
            return null;
    }

    public String getFullName() {
        return String.format("%d %s", id, firstName);
    }

}
  
