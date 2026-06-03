interface playable{
	void play();
}
class Guitar implements playable{
	public void play(){
		System.out.println("Guitar is playing!");
	}
}
class Piano implements playable{
	public void play(){
		System.out.println("Piano is playing!");
	}
}
class Interface{
	public static void main(String args[]){
		Guitar g = new Guitar();
		Piano p = new Piano();
		g.play();
		p.play();
	}
	
}