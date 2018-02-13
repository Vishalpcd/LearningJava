package lambdaExpression;
//the below notation will restrict the interface to declare only one method in the interface 
@FunctionalInterface
interface Result
{
	public void show();
}

public class FunctionalInterfceDemo {
	public static void main(String args[])
	{
	Result result=() ->{ System.out.println("This is the lambda expression example ");
		};
	/*() -> is the lambda expression
	 * lambda expression is only used in the functional interface it cannot be used in other places*/

	result.show();
	}
}
