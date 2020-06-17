import java.util.ArrayDeque;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayDeque<String> world=new ArrayDeque<String>();
		
		world.addFirst("unfriendly");
		world.addFirst("cool-tempered");
		world.add( "friendly");
	   	world.add("kind");
		world.add("nice");
		world.add("generous");
		world.add("funny");
		world.add("polite ");
		world.add("honest");
		world.addLast("horrible");

		String First = world.pollFirst();
		String First1=  world.removeFirst();
		
		
		String Last = world.pollLast();
		System.out.println(world);
		
		
		
	}



	}

