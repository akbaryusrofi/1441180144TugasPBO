class circle{

	private double radius;
	 private String color;

	public circle(){
		 radius=1.0;
		color="pink";
	}

	public circle(double r){
		radius=r;
		color="pink";
	}
	public circle(double r, String c){
		radius=r;
		color=c;
	}



	public double setRadius(){
		return radius;
	}
	public String getColor(){
		return color;
	}
	public String setColor(){
		return color;
	}

	public double getArea(){
		return radius*radius*Math.PI;
	}

}