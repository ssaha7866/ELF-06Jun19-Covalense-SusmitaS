package com.covalense.java.assessmentone.questionseven;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import lombok.extern.java.Log;
@Log
public class CountCandidateTest {

	public static void main(String[] args) {

		/*
		 * Function<String,String>f=(i,j)->if(i.compareTo(j)) return
		 * 
		 * Candidate c=(i)->{ if(i>=40 && j.gender.compareTo(c.gender)); };
		 */
		
		ArrayList<Candidate> al = new ArrayList<Candidate>();
		al.add(new Candidate("Priya", 40, "female"));
		al.add(new Candidate("Ajay", 50, "male"));
		al.add(new Candidate("Sunita", 34, "female"));
		al.add(new Candidate("Shalini", 87, "female"));
		al.add(new Candidate("Priyadarshan", 88, "male"));
		al.add(new Candidate("Kshitej", 68, "male"));
		al.add(new Candidate("Karan", 50, "male"));
		al.add(new Candidate("Priyadarshan", 71, "male"));
		
		List<Candidate> candidatefilterlist=al.stream().filter( p->p.gender.equals("female")).collect(Collectors.toList());
		List<Candidate> passedfemalecandidate=candidatefilterlist.stream().filter(i->i.marks>=40).collect(Collectors.toList());
		log.info("List of passed female candidates is "+ passedfemalecandidate);
	}

}
