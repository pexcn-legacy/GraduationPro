package app.logic.pojo;

/*
 * GZYY    2016-10-24  下午2:55:23
 */

public class OrgUnreadNumberInfo {

	private String org_id;
	private String org_name;
	private String org_logo_url;

	public String getOrg_logo_url() {
		return org_logo_url;
	}

	public void setOrg_logo_url(String org_logo_url) {
		this.org_logo_url = org_logo_url;
	}

	public String getOrg_id() {
		return org_id;
	}

	public void setOrg_id(String org_id) {
		this.org_id = org_id;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	private int count;

	public String getOrg_name() {
		return org_name;
	}

	public void setOrg_name(String org_name) {
		this.org_name = org_name;
	}

}
