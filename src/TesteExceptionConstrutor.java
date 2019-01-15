
public class TesteExceptionConstrutor {

	public static void main(String[] args) {
		
		try {
			
			ClasseQualquer c = new ClasseQualquer(-1, "teste");
			
		}catch(IllegalArgumentException e) {
			
			e.printStackTrace();
			
		}

	}

}
