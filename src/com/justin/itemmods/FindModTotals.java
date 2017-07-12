package com.justin.itemmods;
import com.justin.items.Flask;

public class FindModTotals {
	public int prefixesAvailable(Flask flask){
		//TODO delete this line
		System.out.println("getprefixlist.size" + flask.getPrefixList().size());
		return flask.getPrefixList().size();
	}
	public int suffixesAvailable(Flask flask){
		//TODO delete this line
		System.out.println("getsuffixlist" + flask.getSuffixList().size());
		return flask.getSuffixList().size();
	}
}
