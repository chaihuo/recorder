package bananaLighter.hibernate.domain;

// Generated 2014-4-19 23:23:35 by Hibernate Tools 4.0.0

/**
 * SysUser generated by hbm2java
 */
public class SysUser implements java.io.Serializable {

	private Integer sysUserNo;
	private String sysUserName;

	public SysUser() {
	}

	public SysUser(String sysUserName) {
		this.sysUserName = sysUserName;
	}

	public Integer getSysUserNo() {
		return this.sysUserNo;
	}

	public void setSysUserNo(Integer sysUserNo) {
		this.sysUserNo = sysUserNo;
	}

	public String getSysUserName() {
		return this.sysUserName;
	}

	public void setSysUserName(String sysUserName) {
		this.sysUserName = sysUserName;
	}

}