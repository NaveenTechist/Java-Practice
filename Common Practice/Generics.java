class Fruits <T> {  // Reusability and Type Safety of Generics
    T fruit;
    
    void setData(T fruit){
        this.fruit = fruit;
    }
    
    T getData() {
        return fruit;
    }
}

public class Main
{
	public static void main(String[] args) {
		Fruits<Integer> obj1 = new Fruits();
		obj1.setData(7);
		System.out.println(obj1.getData());
		
		Fruits<String> obj2 = new Fruits();
		obj2.setData("Fruits");
		System.out.println(obj2.getData());
		
	}
}
