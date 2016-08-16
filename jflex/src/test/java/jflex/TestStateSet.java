package jflex;

public class TestStateSet {

	public static void main(String[] args) {
		StateSet ss = new StateSet(10);
		ss.addState(1);
		ss.addState(3);
		ss.addState(65);
		System.out.println(ss);
	}

}
