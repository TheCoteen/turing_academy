package az.edu.turing.MyApps.HappyFamilyProjectNew;

import java.util.ArrayList;

public class Family {
    private Man father;

    private Woman mother;

    private ArrayList<Human> children = new ArrayList<>();

    private Pet pet;

    public Family(Man father, Woman mother, ArrayList<Human> children, Pet pet) {
        this.father = father;
        this.mother = mother;
        this.children = children;
        this.pet = pet;
    }

    public Family(Man father, Woman mother) {
        this.father = father;
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Man father) {
        this.father = father;
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Woman mother) {
        this.mother = mother;
    }

    public ArrayList<Human> getChildren() {
        return children;
    }

    public void setChildren(ArrayList<Human> children) {
        this.children = children;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void addChild(Human child){
        this.getChildren().add(child);
    }

    public boolean deleteChild(int index){
        if(index < this.getChildren().size()){
            this.getChildren().remove(index);
            return true;

        }

        else{
            return false;
        }

    }

    public boolean deleteChild(Human child){
        for (Human c : this.getChildren()){
            if(c.hashCode() == child.hashCode()){
                this.getChildren().remove(c);
                return true;
            }
        }
        return false;
    }

    public int countFamily(){
        return this.getChildren().size() + 2;
    }

    @Override
    public String toString() {
        return "Family{" +
                "father=" + father +
                ", mother=" + mother +
                ", children=" + children +
                ", pet=" + pet +
                '}';
    }
}
