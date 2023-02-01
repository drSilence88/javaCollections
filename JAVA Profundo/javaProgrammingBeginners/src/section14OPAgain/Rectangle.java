package section14OPAgain;

public class Rectangle {
	
	private int length;
	private int width;
	
	public Rectangle(int lenght, int width) {
		this.length = lenght;
		this.width = width;
	}
	
	public int getLenght() {
		return length;
	}

	public void setLenght(int lenght) {
		this.length = lenght;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int area() {
		return length * width;
	}
	
	public int perimeter() {
		return 2 * (length + width);
	}
	
	public String toString() {
		return String.format("length - %d width - %d area - %d perimeter - %d", length, width, area(), perimeter());
	}
}
