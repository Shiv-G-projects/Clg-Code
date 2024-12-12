
public class ExampleRoom_2 {
	public static void main(String[] args) {
		Robot robot = new Robot("xxx \n  x \n  xx", 0, 0); int[] endpoint = {3, -2};//maze1
		//Robot robot = new Robot("xxxxx\n    x\n xxxx\n x   \n xxxx", 0, 0); int[] endpoint = {4, -4}; //maze 2 
		//Robot robot = new Robot("xxxxx\n    x\nxxx x\nx xxx\nx    \nxxxxx", 0, 0); int[] endpoint = {4, -5}; // maze 3

        int[] coord = {0, 0};
		int[] point = {0, 0};

		while(true){
			if (robot.check('E') && ((point[0] != coord[0] + 1) || point[1] != coord[1])){
                robot.go('E');
				point[0] = coord[0];
				point[1] = coord[1];
                coord[0] += 1;
				System.out.println("Moved East");

            }
            else if (robot.check('S')  && ((point[1] != coord[1] - 1  || point[0] != coord[0]))){
                robot.go('S');
				point[0] = coord[0];
				point[1] = coord[1];
                coord[1] -= 1;
				System.out.println("Moved South");

            }
            else if (robot.check('W')  && ((point[0] != coord[0] - 1  || point[1] != coord[1]))){
                robot.go('W');
				point[0] = coord[0];
				point[1] = coord[1];
                coord[0] -= 1;
				System.out.println("Moved West");

            }
            else if (robot.check('N') && ((point[1] != coord[1] + 1  || point[0] != coord[0]))){
                robot.go('N');
				point[0] = coord[0];
				point[1] = coord[1];
                coord[1] += 1;
				System.out.println("Moved North");
            }
			if (coord[0] == endpoint[0] && coord[1] == endpoint[1]) {
				robot.say("Reached the end!");
				break;
			}

			//These are for troubleshooting purposes
            System.out.println(coord[0] +"," + coord[1]);
            System.out.println(point[0] +"," + point[0]);
		}

		}
   
}