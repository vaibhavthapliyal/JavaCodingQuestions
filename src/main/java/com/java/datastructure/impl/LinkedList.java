package com.java.datastructure.impl;

public class LinkedList<T> {
	
	private Node head;
	
	public class Node{
		T data;
		Node next;
		
		public Node(T data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public void add(T data) {
		Node node = new Node(data);
		

		if(head == null) {
			head = node;
		}else {
			Node tmpNode = head;
			while(tmpNode.next != null) {
				tmpNode = tmpNode.next;
			}
			tmpNode.next = node;
		}
	}

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}
	
	
	@Override
	public String toString() {
		String list = "";
		Node currNode = this.getHead();
		while(currNode != null) {
			list = list + "," + currNode.data;
			currNode = currNode.next;
		}
		
		return "[" + list.substring(1, list.length()) + "]";
	}

	public static void main(String[] args) {
		
		LinkedList<Integer> data = new LinkedList<>();
		
		data.add(5);
		
		data.add(2);
		
		data.add(1);
		
		System.out.println(data);
	}
	
}
