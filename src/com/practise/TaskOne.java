package com.practise;

public class TaskOne {
	 

	public void methodOne() {
		System.out.println("master this is method one");
	}
		public void methodTwo() {
		System.out.println("master this is method two");
    }
		public void methodThree() {
			System.out.println("aarthi branch this is method three");
	    }
		public void methodFour() {
			System.out.println("sri branch this is method four");
		}
			public void methodFive() {
			System.out.println("sri branch this is method five");
			}
		
  public static void main(String[] args) {
	TaskOne to=new TaskOne();

	to.methodFour();
	to.methodFive();

	to.methodOne();
	to.methodTwo();
	to.methodThree();

}
}
