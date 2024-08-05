package homework.homework2.office;

public class Manager {
    private String managerName;

    public Manager(String managerName) {
        this.managerName = managerName;
    }

    public String getManagerName() {
        return managerName;
    }

    public void scream(){
        System.out.println("я ничего не успеваю, помогите!");
    }
}
