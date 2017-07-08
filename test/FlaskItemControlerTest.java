import org.junit.Before;
import org.junit.Test;

public class FlaskItemControlerTest {
	FlaskItemControler flaskItemControler;
	@Before
	public void init(){
		flaskItemControler = new FlaskItemControler();
	}
	
	@Test
	public void CanCreateQuickSilver(){
		flaskItemControler.CreateQuickSilver();
	}
}
