package Guess_OutPut;

public class Switch_case {
public static void main(String[] args) {
	String day="MONDAY";
	switch(day)
	{
	case "MONDAY","TUESDAY"->System.out.println("workday");
	case "SATURDAY","SUNDAY"->System.out.println("Weekend");
	default->System.out.println("invlid day");
	}
}
}
