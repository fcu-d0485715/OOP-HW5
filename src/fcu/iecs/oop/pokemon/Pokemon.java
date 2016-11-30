package fcu.iecs.oop.pokemon;

public class Pokemon {

	private final String name;
	private int cp;
	
	Pokemon(String name,int cp){	
		this.name = name;
		this.cp = cp;
	}
	
	public String GetterName(){
		return this.name;
	}
	
	public int GetterCP(){
		return this.cp;
	}
	
	public void SetterCP(int CP){
		this.cp = CP;
	}
}
