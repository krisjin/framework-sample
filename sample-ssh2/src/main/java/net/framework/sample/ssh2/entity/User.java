package net.framework.sample.ssh2.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name = "user")
@Cache(usage=CacheConcurrencyStrategy.NONSTRICT_READ_WRITE,region="net.framework.sample.ssh2.entity")
public class User extends IdEntity {

	private String name;
	private String password;
	private short sex;
	private short age;
	private UserBlog userBlog;

	@OneToOne
	public UserBlog getUserBlog() {
		return userBlog;
	}

	public void setUserBlog(UserBlog userBlog) {
		this.userBlog = userBlog;
	}

	@Column(name = "name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "sex")
	public short getSex() {
		return sex;
	}

	public void setSex(short sex) {
		this.sex = sex;
	}

	@Column(name = "age")
	public short getAge() {
		return age;
	}

	public void setAge(short age) {
		this.age = age;
	}

	@Column(name = "password")
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
