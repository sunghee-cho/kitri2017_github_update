package command;
//============command pattern=================
abstract class Command {//틀 제공
	abstract public void run();//2가지 실행 경우
}
class ACommand extends Command{
	public void run(){
		System.out.println("ACommand실행");
	}
}
class BCommand extends Command{
	public void run(){
		System.out.println("BCommand실행");
	}	
}
//=======================================
//======factory method pattern
class CommandFactory {
	public Command getCommand(String name){
		Command c = null;
		if(name.equalsIgnoreCase("a")){
			c = new ACommand();
		}
		else if(name.equalsIgnoreCase("b")){
			c = new BCommand();
		}
		return c;
	}
}
//입력값 - Command 결정권한 factory : 세부사항 모른다
public class CommandTest {
public static void main(String[] args) {
	CommandFactory factory = new CommandFactory();
	Command c = factory.getCommand(args[0]);
	c.run();
}
}





