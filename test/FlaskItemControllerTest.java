import org.junit.Before;
import org.junit.Test;

public class FlaskItemControllerTest {
	FlaskItemController flaskItemControler;
	@Before
	public void init(){
		flaskItemControler = new FlaskItemController();
	}
	
	@Test
	public void CanCreateQuickSilver(){
		flaskItemControler.CreateQuickSilver();
	}
}
