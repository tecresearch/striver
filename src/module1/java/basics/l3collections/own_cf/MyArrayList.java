package module1.java.basics.l3collections.own_cf;

public class MyArrayList implements MyList{

		
	public static void main(String[] args) {
		

	}

	@Override
	public boolean search(int value) {
		
		int [] arr= {12,54,3,6,7,9};
		
		for(int i=0; i<arr.length; i++) {
			if(i==value) {
				return true;
			}
		}
		return false;
		
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("Value added");
		
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		System.out.println("Value deleted");
	}

	@Override
	public boolean contains() {
		// TODO Auto-generated method stub
		System.out.println("Contained");
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		System.out.println("Size checking logic worked");
		return 0;
	}

	@Override
	public void printList() {
		// TODO Auto-generated method stub
		System.out.println("List printed");
		
	}

	@Override
	public void updateList() {
		// TODO Auto-generated method stub
		System.out.println("List updated");
	}

	@Override
	public void getDublicate() {
		// TODO Auto-generated method stub
		System.out.println("Dublicate found");
	}

	@Override
	public void sortList() {
		// TODO Auto-generated method stub
		System.out.println("List sorted");
		
	}

}
