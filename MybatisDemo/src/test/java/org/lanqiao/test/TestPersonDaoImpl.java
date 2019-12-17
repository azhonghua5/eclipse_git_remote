package org.lanqiao.test;

import java.util.List;

import org.junit.Test;
import org.lanqiao.dao.impl.PersonDaoImpl;
import org.lanqiao.entity.Person;

public class TestPersonDaoImpl {
	
	
	
	@Test
	public void testGetPersonById() {
		Person p = new PersonDaoImpl().getPersonById(1);
		System.out.println(p.getName());
	}
	
	
	@Test
	public void testAddUser() {
		Person person = new Person(3,"zxq",26);
		
		System.out.println(new PersonDaoImpl().addPerson(person));
	}

	@Test
	public void testDeleteUserById() {
		
		System.out.println(new PersonDaoImpl().deletePersonById(3));
	}

	@Test
	public void testUpdateUserById() {
		Person person = new Person(3,"zxq",100);
		
		System.out.println(new PersonDaoImpl().updatePersonById(person));
	}
	
	@Test
	public void testSelectAll() {
		List<Person> list = new PersonDaoImpl().selectAll();
		
		for(Person p : list) {
			System.out.println(p);
			
		}
	}

}
