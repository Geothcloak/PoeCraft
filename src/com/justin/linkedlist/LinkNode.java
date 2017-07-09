package com.justin.linkedlist;

public class LinkNode {
	private Object data;
	private LinkNode next = null;
	
	public LinkNode(Object data){
		this.data= data;
	}

	
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public LinkNode getNext() {
		return next;
	}
	public void setNext(LinkNode next) {
		this.next = next;
	}	
	
	
	
}
