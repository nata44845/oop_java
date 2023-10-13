package ru.gb.family_tree.human;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Human {
    private int id;
    private String firstName;
    private String middleName;
    private String lastName;
    private LocalDate birthDate;
    private LocalDate deathDate;
    private Gender gender; 
    private Human father, mother;
    private List<Human> children;

    /*
     * 
     * public Point2D(int valueX, int valueY) {
        x = valueX;
        y = valueY;
    }

    public Point2D(int value) {
        this(value, value);
    }
    public Point2D() {
        this(0);
    }
     */

    public Human() {
        children = new ArrayList<>();
    }

    public Human(String firstName, String lastName) {
        this(firstName,null,lastName,null,null);
    }

    public Human(String firstName, String middleName, String lastName) {
        this(firstName, middleName,lastName,null,null);
    }


    public Human(String firstName, String middleName, String lastName,
        LocalDate birthDate, Gender gender) {
        this(firstName, middleName,lastName,birthDate,null,gender,null,null);
    }

    public Human(String firstName, String middleName, String lastName,
                LocalDate birthDate, LocalDate deathDate,
                Gender gender, Human father, Human mother) {
        this();
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
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

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
        if (father != null) father.addChild(this,Gender.Male);
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
        if (mother != null) mother.addChild(this,Gender.Female);
    }

    public List<Human> getChildren() {
        return children;
    }

    private void addChild(Human human, Gender sex) {
        if (!this.children.contains(human)) {
            this.children.add(human);
            if (this.gender != null) {
                if (this.gender == Gender.Male) 
                    human.setFather(this);
                else 
                    human.setMother(this);
            } else {
                if (sex == Gender.Male) 
                    human.setFather(this);
                else 
                    human.setMother(this);
            }
        }
    }

    public void setChildren(List<Human> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (middleName != null)
            sb.append(String.format("%d %s %s %s", id,firstName,middleName,lastName));
        else
            sb.append(String.format("%d %s %s", id, firstName,lastName));
        if (birthDate != null) 
            sb.append(String.format(", дата рождения %s", birthDate));
        if (deathDate != null) 
            sb.append(String.format(", дата смерти %s", deathDate));
        if (gender != null) 
            sb.append(String.format(", %s", gender));
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
        if (!(obj instanceof Human)) return false;
        Human human = (Human)obj;
        //System.out.println(human.getFirstName()+human.getMiddleName()+human.getLastName()+human.getBirthDate());
        return (human.getFirstName()+human.getMiddleName()+human.getLastName()+human.getBirthDate()).
        equals(getFirstName()+getMiddleName()+getLastName()+getBirthDate());
    }

}
  
