package homework.homework2.office;

public class Boss {
    private String name;

    public Boss(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public void accelerateManager(Manager manager){
        System.out.printf("%s быстрее!!!\n", manager.getName());
    }
}
