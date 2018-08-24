package com.ricko.annotations;

import java.util.*;
import java.lang.reflect.*;

public class Solution {

	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException {
		// TODO Auto-generated method stub
		String role = "JNIOR";
		int spend = 75;
		
		//copied from hackerrank for better understanding
		
		Class annotatedClass = FamilyMember.class;
		Method[] methods = annotatedClass.getMethods();
		for (Method method : methods) {
			if (method.isAnnotationPresent(FamilyBudget.class)) {
				FamilyBudget family = method
						.getAnnotation(FamilyBudget.class);
				String userRole = family.userRole();
				int budgetLimit = family.budgetLimit();
				if (userRole.equals(role)) {
					if(spend<=budgetLimit){
						method.invoke(FamilyMember.class.newInstance(),
								budgetLimit, spend);
					}else{
						System.out.println("Budget Limit Over");
					}
				} else {
					System.out.println("Role not found");
				}
			}
		}
	}

}
