import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.justin.items.Flask;

public class FlaskItemControllerTest {
	FlaskItemController flaskItemControler;
	@Before
	public void init(){
		flaskItemControler = new FlaskItemController();
	}
	
	@Test
	public void CanCreateQuickSilver(){
		//flaskItemControler.CreateQuickSilver();
		Flask flask = null;
		Assert.assertEquals(flask, flaskItemControler.CreateQuickSilver());
	}
}
