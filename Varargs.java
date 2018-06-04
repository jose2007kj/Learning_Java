public class Varargs
{
	public static void main(String []args)
	{

		System.out.println("Welcome calling first function");
		double []list={1,2,3,4,5,5.5};
		varArgs(list);
		System.out.println("Welcome calling second function");
		varArgs(new double[]{1,2,3,4});

	}
	public static void varArgs(double... list)
	{
		System.out.println("Inside varArgs function");
		for(int i=0;i<list.length;i++)
		{
			System.out.println("the variable argumnets are"+list[i]);
		}
	}
	public void finalize( )
	{
		System.out.println("inside finialize function!!!!");
	}
}