package net.framework.sample.ssh2.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * TODO 此处填写 class 信息
 * 
 * @date 2013-12-30
 * @author krisjin (mailto:krisibm@163.com)
 */
@MappedSuperclass
public  class IdEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected long id;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

}
