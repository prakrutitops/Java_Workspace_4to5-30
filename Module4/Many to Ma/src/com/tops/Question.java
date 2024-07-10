package com.tops;

import java.util.List;

import javax.persistence.*;


import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="Question1")
public class Question 
{
	@Id
	@GeneratedValue(generator="increment")
	@GenericGenerator(name="increment",strategy="increment")
	@Column(name="qid")
	int id;
	
	@Column(name="qname")
	String qname;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getQname() {
		return qname;
	}

	public void setQname(String qname) {
		this.qname = qname;
	}
	
	@ManyToMany(targetEntity = Answer.class, cascade = { CascadeType.ALL })
	
	@JoinTable(name = "question_answer", joinColumns = { @JoinColumn(name = "q_id") }, inverseJoinColumns = { @JoinColumn(name = "ans_id") })
	
	
	private List<Answer> answers;

	public List<Answer> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}
	
	
	
	
	
	
	
	
}
