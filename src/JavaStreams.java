import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;



public class JavaStreams {

	public static void main(String[] args) {
		ArrayList<String> names=new ArrayList<String>();
		names.add("naman");
		names.add("abhijeet");
		names.add("aman");
		names.add("daya");
//	Long c=	names.stream().filter(s->s.startsWith("a")).count();
//	System.out.println(c);
		
		
		names.stream().filter(s->s.endsWith("n")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
	//List<String> name=Arrays.asList("naman","abhijeet","aman","daya");
		names.stream().filter(s->s.startsWith("a")).sorted().forEach(s->System.out.println(s));
	List<Integer> name=Arrays.asList(1,2,2,10,5,4,9,9);
    name.stream().distinct().sorted().forEach(s->System.out.println(s));

	}

}
