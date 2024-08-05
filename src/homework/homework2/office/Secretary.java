package homework.homework2.office;

public class Secretary {
    public void request(Boss boss, Manager manager, Guard guard){
        System.out.printf("%s не волнуйтесь, %s все успеет. %s - подождите!"
                , boss.getName(), manager.getName(), guard.getName());
    }
}
