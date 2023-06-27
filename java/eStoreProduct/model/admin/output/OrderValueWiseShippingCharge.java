package eStoreProduct.model.admin.output;

public class OrderValueWiseShippingCharge {
	private Integer id;
	private Double from;
	private Double to;
	private Double shippingAmount;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Double getFrom() {
		return from;
	}

	public void setFrom(Double from) {
		this.from = from;
	}

	public Double getTo() {
		return to;
	}

	public void setTo(Double to) {
		this.to = to;
	}

	public Double getShippingAmount() {
		return shippingAmount;
	}

	public void setShippingAmount(Double shippingAmount) {
		this.shippingAmount = shippingAmount;
	}

	public OrderValueWiseShippingCharge(Integer id, Double from, Double to, Double shippingAmount) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.shippingAmount = shippingAmount;
	}

	public OrderValueWiseShippingCharge() {
		super();
		// TODO Auto-generated constructor stub
	}
}
