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

	/**
	 * Add node to a linkedlist
	 * @param data
	 */
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

	/**
	 * Add Node at the beginning of a linkedList
	 * @param data
	 */
	public void addInBeginning(T data){
		Node node = new Node(data);
		node.next = head;
		head = node;
	}

	/**
	 * Add node at the nth index of a linked list
	 * @param index
	 * @param data
	 */
	public void add(int index, T data){
		Node node = new Node(data);
		Node curreNode = this.getHead();
		for (int i = 1; i < index; i++){
			curreNode = curreNode.next;
		}
		if(curreNode != null){
			Node nextNode = curreNode.next;
			curreNode.next = node;
			if(nextNode != null){
				node.next = nextNode;
			}
		}
	}

	public void remove(int index){
		Node prevNode = this.getHead();
		for (int i = 1; i < index-1; i++){
			prevNode = prevNode.next;
		}

		Node currentNode = prevNode.next;

		prevNode.next = currentNode.next;

		currentNode.next = null;
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
		data.add(1);
		data.add(2);
		data.add(9);
		data.add(2, 7);
		data.add(10);
		data.add(4,6);

		data.remove(4);
		System.out.println(data);
	}

}
