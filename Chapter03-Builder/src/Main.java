//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Build a Robot with all properties using setters
        Robot robot1 = new Robot();
        robot1.setShield("Energy Shield");
        robot1.setGun("Plasma Cannon");
        robot1.setSword("Vibroblade");
        robot1.setBrainchip("AI Core v3.0");
        System.out.println("Robot 1 details:\n" + robot1.toString());

        // Build a Robot with RobotBuilder using fluent interface
        Robot robot2 = new RobotBuilder()
                .shield("Titanium Alloy")
                .gun("Laser Rifle")
                .sword(null)  // Set sword to null
                .brainchip("Military Grade Processor")
                .getResult();
        System.out.println("\nRobot 2 details:\n" + robot2.toString());

        // Dengan Builder Director
        RobotDirector director = RobotDirector.getInstance();
        Robot RereRobot = director.RereRobot();
        System.out.println("\nRere Robot");
        System.out.println(RereRobot);
        System.out.println("\n\n");
    }
}

