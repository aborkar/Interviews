package tests;

/**
 * Created by aborkar on 9/7/2022.
 */
public class InheritanceChild extends InheritanceParent {

    public String getName() {
        return name;
    }

    public void setName(String namme) {
        this.name = namme;
    }

    private String name;

    public InheritanceChild(String name){
        this.name=name;
    }


    public static void main(String[] args){
        InheritanceChild child = new InheritanceChild("Beta");

    }
}
