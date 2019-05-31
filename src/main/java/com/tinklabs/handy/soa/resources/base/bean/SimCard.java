package com.tinklabs.handy.soa.resources.base.bean;

public class SimCard extends BaseVO{

	/**
	* @fields
	*/
	private static final long serialVersionUID = 4774939842463658720L;

	private String sim_id;
	private String country_code;
	private String imsi;
	private String phone_number;
	private String service_provider;
	private String status;
	private String created;
	private String modified;
	
	
	public String getSim_id() {
		return sim_id;
	}
	public void setSim_id(String sim_id) {
		this.sim_id = sim_id;
	}
	public String getCountry_code() {
		return country_code;
	}
	public void setCountry_code(String country_code) {
		this.country_code = country_code;
	}
	public String getImsi() {
		return imsi;
	}
	public void setImsi(String imsi) {
		this.imsi = imsi;
	}
	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	public String getService_provider() {
		return service_provider;
	}
	public void setService_provider(String service_provider) {
		this.service_provider = service_provider;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCreated() {
		return created;
	}
	public void setCreated(String created) {
		this.created = created;
	}
	public String getModified() {
		return modified;
	}
	public void setModified(String modified) {
		this.modified = modified;
	}

	
}
