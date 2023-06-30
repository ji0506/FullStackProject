package org.zerock.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Criteria {
	private int pageNum, amount, section;
	
	public Criteria() {
		this(1, 10, 1);
	}

	public Criteria(int pageNum, int amount, int section) {
		this.pageNum = pageNum;
		this.amount = amount;
		this.section = section;
	}
	
	
}
