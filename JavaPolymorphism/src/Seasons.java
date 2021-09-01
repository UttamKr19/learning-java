
public enum Seasons {
	SUMMER(3), WINTER(2), SPRING(1), AUTUMN(4);

	private int discount;

	private Seasons(int discount) {
		this.discount = discount;
	}

	public int getdiscount() {
		return discount;
	}
}
