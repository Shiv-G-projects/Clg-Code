import java.util.*;

public class ExampleRoom_3 {
	// This program does not work for maze 5
	// I refused to use AI to get the answer, so I don't have one for maze 5
	public static int diffns;
	public static int diffew;
	public static void main(String[] args) {
		Robot robot = new Robot("xxxx\nxx xxx\nx  x\nx xxxx", 0, 0); int[] endpoint = {5, -3}; //maze 4

        int[] coord = {0, 0};
		int[] point = {0, 0};
		int n = 0;

		while(true){
			n +=1;
			List<Pair<Float,Short>> pointList = new ArrayList<Pair<Float,Integer>>();
			pointList.add(new Pair<>(coord[0], coord[1]));

			if (robot.check('E') && ((point[0] != coord[0] + 1) || point[1] != coord[1])){
                robot.go('E');
				point[0] = coord[0];
				point[1] = coord[1];
                coord[0] += 1;
				System.out.println("Moved East");
				diffns = point[1] - coord[1];
				diffew = point[0] - coord[0];

            }
            else if (robot.check('S')  && ((point[1] != coord[1] - 1  || point[0] != coord[0]))){
                robot.go('S');
				point[0] = coord[0];
				point[1] = coord[1];
                coord[1] -= 1;
				System.out.println("Moved South");
				diffew = point[0] - coord[0];
				diffns = point[1] - coord[1];

            }
            else if (robot.check('W')  && ((point[0] != coord[0] - 1  || point[1] != coord[1]))){
                robot.go('W');
				point[0] = coord[0];
				point[1] = coord[1];
                coord[0] -= 1;
				System.out.println("Moved West");
				diffew = point[0] - coord[0];
				diffns = point[1] - coord[1];

            }
            else if (robot.check('N') && ((point[1] != coord[1] + 1  || point[0] != coord[0]))){
                robot.go('N');
				point[0] = coord[0];
				point[1] = coord[1];
                coord[1] += 1;
				System.out.println("Moved North");
				diffew = point[0] - coord[0];
				diffns = point[1] - coord[1];
            }

			else {

				if (diffns > 0){
					while (robot.check('E') == false && robot.check('W') == false){
					robot.go('S');
					System.out.println("Blocked North");
					coord[1] -= 1;
					System.out.println("Moved South");
					}
				}
				else if (diffns < 0) {
					while (robot.check('E') == false && robot.check('W') == false){
					robot.go('N');
					System.out.println("Blocked South");
					coord[1] += 1;
					System.out.println("Moved North");
					}
				}
				else if (diffew > 0){
					while (robot.check('N') == false && robot.check('S') == false){
					robot.go('E');
					System.out.println("Blocked West");
					coord[0] += 1;
					System.out.println("Moved East");
					}
				}
				else if (diffew < 0) {
					while (robot.check('N') == false && robot.check('S') == false){
					robot.go('W');
					System.out.println("Blocked East");
					coord[0] -= 1;
					System.out.println("Moved West");
					
					}
				}
			}

			if (coord[0] == endpoint[0] && coord[1] == endpoint[1]) {
				robot.say("Reached the end!");
				break;
			}

			//These are for troubleshooting purposes
            System.out.println(coord[0] +"," + coord[1]);
            System.out.println(point[0] +"," + point[1]);
			System.out.println(diffns);
			System.out.println(diffew);
		}

		}
}
