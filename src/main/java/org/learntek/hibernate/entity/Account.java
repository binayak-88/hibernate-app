/**
 * 
 */
package org.learntek.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author HP
 *
 */
@Entity
@Table(name = "account")
public class Account {
	@Id
	@Column(name = "accountno")
	private int accountno;
	
	@Column(name = "acchname")
	private String acchname;
	
	@Column(name = "accbal")
	private double accbal;
	

	/**
	 * @return the accountno
	 */
	public int getAccountno() {
		return accountno;
	}

	/**
	 * @param accountno the accountno to set
	 */
	public void setAccountno(int accountno) {
		this.accountno = accountno;
	}

	/**
	 * @return the acchname
	 */
	public String getAcchname() {
		return acchname;
	}

	/**
	 * @param acchname the acchname to set
	 */
	public void setAcchname(String acchname) {
		this.acchname = acchname;
	}

	/**
	 * @return the accbal
	 */
	public double getAccbal() {
		return accbal;
	}

	/**
	 * @param accbal the accbal to set
	 */
	public void setAccbal(double accbal) {
		this.accbal = accbal;
	}
	
	
}
