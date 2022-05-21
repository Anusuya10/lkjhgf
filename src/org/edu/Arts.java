package org.edu;
class Arts extends Education {
	private void bSc() {
		System.out.println("Zology");
}
private void bEd() {
System.out.println("English");
}
private void bA() {
	System.out.println("Tamil");
}
@Override
public void ug() {
	System.out.println("Civil");
}
@Override
public void pg() {
System.out.println("IT");
}
public static void main(String[] args) {
	Arts s = new Arts();
	s.bA();
	s.bEd();
	s.bSc();
	s.pg();
	s.ug();
	Education a = new Education();
	a.pg();
	a.ug();
	
	
}
	

}
