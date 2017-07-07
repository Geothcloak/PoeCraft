
public class FlaskItemControler {
	PrefixListSnapshot prefixListSnapshot = new PrefixListSnapshot();
	PrefixListable prefixListable = prefixListSnapshot;
	
	SuffixListSnapshot suffixListSnapshot = new SuffixListSnapshot();
	SuffixListable suffixListable = suffixListSnapshot;
	
	
	
	Flask flask = new Flask("QuickSilver", 0, prefixListable, suffixListable);
	
	
}
