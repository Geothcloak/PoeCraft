import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.justin.itemmods.PrefixListSnapshot;
import com.justin.itemmods.PrefixListable;
import com.justin.itemmods.SuffixListSnapshot;
import com.justin.itemmods.SuffixListable;
import com.justin.items.Flask;

public class FlaskItemControllerTest {
	FlaskItemController flaskItemControler;
	
	private PrefixListSnapshot prefixListSnapshot = new PrefixListSnapshot();
	private PrefixListable prefixListable = prefixListSnapshot;
	
	private SuffixListSnapshot suffixListSnapshot = new SuffixListSnapshot();
	private SuffixListable suffixListable = suffixListSnapshot;
	Flask flaskControl;
	@Before
	public void init(){
		flaskItemControler = new FlaskItemController();
		
		flaskControl = new Flask("q", 20, prefixListable, suffixListable);
	}
	
	@Test
	public void CanCreateQuickSilver(){
		//flaskItemControler.CreateQuickSilver();
		Flask flaskUnderTest = flaskItemControler.CreateQuickSilver();
		
		Assert.assertEquals(flaskControl.getName(), flaskUnderTest.getName());
		Assert.assertEquals(flaskControl.getItemLevel(), flaskUnderTest.getItemLevel());
		Assert.assertEquals(flaskControl.getPrefixList(), flaskUnderTest.getPrefixList());
		Assert.assertEquals(flaskControl.getSuffixList(), flaskUnderTest.getSuffixList());
	}
}
