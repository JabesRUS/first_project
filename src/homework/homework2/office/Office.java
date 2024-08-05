package homework.homework2.office;

public class Office {
    Boss boss;
    Manager manager;
    Guard guard;
    Secretary secretary;

    public Office(Boss boss, Manager manager, Guard guard, Secretary secretary) {
        this.boss = boss;
        this.manager = manager;
        this.guard = guard;
        this.secretary = secretary;
    }

    public void workDay(){
        boss.accelerateManager(manager);
        manager.scream();
        guard.giveMeMoney();
        secretary.request(boss.getName(), manager.getName(), guard.getName());
    }
}
