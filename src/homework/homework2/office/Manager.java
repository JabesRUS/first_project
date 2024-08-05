package homework.homework2.office;

public class Manager {
    private String name;

    public Manager(String managerName) {
        this.name = managerName;
    }

    public String getName() {
        return name;
    }

    public void scream(){
        System.out.println("я ничего не успеваю, помогите!");
    }
}
