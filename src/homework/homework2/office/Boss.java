package homework.homework2.office;

public class Boss {
    private String bossName;

    public Boss(String bossName) {
        this.bossName = bossName;
    }

    public String getBossName() {
        return bossName;
    }


    public void accelerateManager(Manager manager){
        System.out.printf("%s быстрее!!!\n", manager.getManagerName());
    }
}
