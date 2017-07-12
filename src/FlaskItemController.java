import com.justin.currencymarket.CalcCraftCost;
import com.justin.currencymarket.CurrencyMarketSnapshot;
import com.justin.currencymarket.Valueable;
import com.justin.input.InputFromUser;
import com.justin.itemmods.PrefixListSnapshot;
import com.justin.itemmods.PrefixListable;
import com.justin.itemmods.SuffixListSnapshot;
import com.justin.itemmods.SuffixListable;
import com.justin.items.Flask;

public class FlaskItemController {
	private PrefixListSnapshot prefixListSnapshot = new PrefixListSnapshot();
	private PrefixListable prefixListable = prefixListSnapshot;
	
	private SuffixListSnapshot suffixListSnapshot = new SuffixListSnapshot();
	private SuffixListable suffixListable = suffixListSnapshot;
	
	private InputFromUser inputFromUser = new InputFromUser();
	
	private CurrencyMarketSnapshot currencyMarketSnapshot = new CurrencyMarketSnapshot();
	private Valueable valuable = currencyMarketSnapshot;
	private CalcCraftCost calcCraftCost = new CalcCraftCost(valuable);
	
	public void CreateQuickSilver(){
		Flask flask = new Flask(inputFromUser.NameOfItem(), inputFromUser.QuickSilverItemLevel(), prefixListable, suffixListable);
		calcCraftCost.QuicksilverFlask(flask);
	}
	//TODO impliment linkedlist, create beans for suffix and prefix.
	//TODO remove println inside findmodtotals
	//TODO working tests for all classes
	
	
 } 