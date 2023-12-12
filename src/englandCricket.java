public class englandCricket {
    void playing() {
        System.out.println("Bowling");
    }
}
class sriLankaCricket extends englandCricket {
    @Override
    void playing() {
        System.out.println("Batting");
    }
    void practicing() {
        System.out.println("Fielding");
    }
    void selecting() {
        super.playing();
        practicing();
    }
}
class Test1{
    public static void main(String[] args) {
        sriLankaCricket slc = new sriLankaCricket();
        slc.selecting();
    }
}
