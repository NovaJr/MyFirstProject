package Proj.first.am;

public class ProgrammingClassController {
	private ProgrammingClass currentClass;

	public ProgrammingClassController()
	{
		currentClass = new ProgrammingClass();

	}

	public void setup()
	{
		currentClass.start();
	}
}