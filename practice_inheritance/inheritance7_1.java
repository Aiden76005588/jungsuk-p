package practice_inheritance;

class Tv {
	boolean power;
	int channel;
	
	void power( ) {power =!power;}
	void channelUp( ) {++channel;}
	void channelDown( ) { --channel;}
	}

class SmartTv extends Tv {//SmartTv는 Tv에 캡션(자막)을 보여주는 기능을
	boolean caption;      //캡션상태(on/off)
	void displayCaption(String text) {
		if (caption) {    //캡션 상태가 on(true)일 때만 text를 보여준다.
		System.out.println(text);}
	}
}

class Ex7_1 {
	public static void main(String[] args) {
		SmartTv stv= new SmartTv();
		//channel cannot be resolved or is not a field
		stv.channel = 10;   //조상 클래스로부터 상속받은 맴버
		stv.channelUp();    //조상 클래스로부터 상송받은 맴버
		System.out.println(stv.channel);
		stv.displayCaption("Hello, World");
		stv.caption = true;
		stv.displayCaption("Hello, World");
	}
}