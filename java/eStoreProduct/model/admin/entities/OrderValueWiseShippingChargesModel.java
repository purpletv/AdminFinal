package eStoreProduct.model.admin.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "slam_ordervaluewiseshippingcharges")
public class OrderValueWiseShippingChargesModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ordvl_id")
	private Integer id;

	@Column(name = "ordvl_from")
	private Double from;

	@Column(name = "ordvl_to")
	private Double to;

	@Column(name = "ordvl_shippingamount")
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

	public OrderValueWiseShippingChargesModel(Integer id, Double from, Double to, Double shippingAmount) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.shippingAmount = shippingAmount;
	}

	public OrderValueWiseShippingChargesModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	// Constructors, getters, and setters

}
