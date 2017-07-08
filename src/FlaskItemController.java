
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
	//TODO get calculator to work working fully with correct output...
	//TODO remove println inside findmodtotals
	//TODO working tests for all classes
	//TODO using nonunique keys for hashmaps... need alternative
	
 } 