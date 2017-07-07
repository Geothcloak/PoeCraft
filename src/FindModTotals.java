
public class FindModTotals {
	public int prefixesAvailable(Flask flask){
		return flask.getPrefixList().size();
	}
	public int suffixesAvailable(Flask flask){
		return flask.getSuffixList().size();
	}
}
