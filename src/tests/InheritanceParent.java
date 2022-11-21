package tests;

/**
 * Created by aborkar on 9/7/2022.
 */
public class InheritanceParent {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public InheritanceParent(){
    }

    public InheritanceParent(String name){
        this.name = name;
    }


}
