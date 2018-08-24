package com.ricko.annotations;

import java.lang.annotation.*;

@Target(ElementType.METHOD) //method only
@Retention(RetentionPolicy.RUNTIME) //applied at runtime
@interface FamilyBudget {
	String userRole() default "GUEST";
    int budgetLimit() default 100;
}

//target (where to put annotations)
//retention (which stage annotations applied)

public class FamilyMember {
	@FamilyBudget(userRole="SENIOR", budgetLimit=100)
	public void seniorMember(int budget, int moneySpend) {
		System.out.println("Senior Member");
		System.out.println("Spend: " + moneySpend);
		System.out.println("Budget Left: " + (budget - moneySpend));
	}

    @FamilyBudget(userRole="JUNIOR", budgetLimit=50)
	public void juniorUser(int budget, int moneySpend) {
		System.out.println("Junior Member");
		System.out.println("Spend: " + moneySpend);
		System.out.println("Budget Left: " + (budget - moneySpend));
	}
}
