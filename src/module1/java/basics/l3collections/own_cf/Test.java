package module1.java.basics.l3collections.own_cf;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("---------------ArrayList---------------------");
		MyArrayList list=new MyArrayList();

    	
	    	list.add();
	    	list.add();
	    	list.printList();
	    	list.search(12);
	    	list.contains();
	    	list.getDublicate();
	    	list.remove();
	    	list.sortList();
	    	list.updateList();
    	
	    	System.out.println("---------------MyHashSet---------------------");
	MyHashSet hash=new MyHashSet();
		hash.add();
		hash.search(12);
		hash.contains();
		hash.getDublicate();
		hash.remove();
		System.out.println("---------------MyHashMap---------------------");
	MyHashMap map=new MyHashMap();
	map.add();
	map.search(12);
	map.contains();
	map.remove();
	map.size();
	}

}
