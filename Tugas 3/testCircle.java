class testCircle {
public static void main(String[] args) {
	circle cahya = new circle();
	System.out.println("radius = "+ cahya.setRadius() + "color = " + cahya.getColor() + " Luas"+ cahya.getArea());

	circle akbar= new circle(5);
	System.out.println("radius = "+ akbar.setRadius() + "color = " + akbar.getColor() + " Luas"+ akbar.getArea());

	circle pram= new circle(5,"ABANG");
	System.out.println("radius = "+ pram.setRadius() + "color = " + pram.getColor() + " Luas"+ pram.getArea());
}
	}