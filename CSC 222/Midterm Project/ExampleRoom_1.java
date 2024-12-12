
public class ExampleRoom_1 {
	public static void main(String[] args) {
		Robot robot = new Robot("xxx \n  x \n  xx", 0, 0);
		robot.go('E');
		robot.go('E');
		robot.go('S');
		robot.go('S');
		robot.go('E'); 
		robot.say("Reached the end!");
	}
}
