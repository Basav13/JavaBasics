
enum PLang
{
	SDE("JAVA/C++"),
	ANALYSIS("SQL"),
	UI("ANGULAR"),
	ML("PYTHON");
	
	private String lang = "";
	private PLang(String lang)
	{
		this.lang = lang;
	}
	String getLang()
	{
		return this.lang;
	}
	
}

public class CustomEnum {

	public static void main(String[] args) {
		PLang[] arr = PLang.values();
		for(PLang lg : arr)
		{
			System.out.println(lg.getLang()+" required for "+lg.name()+" role");
		}
	}

}
