package com.rbarber

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class EmployeeSpec extends Specification implements DomainUnitTest<Employee> {

    def setup() {
    }

    def cleanup() {
    }

	void calcWeeklyWage(){
when: "A Employee has a fullName and a hourlyRate"
def emp1=new Employee(fullName:'Jack Smith', hourlyRate: 9.55)
then:"The calcWeeklyWage method will calculate the weekly wage"
emp1.calcWeeklyWage()==353.35
}
}
