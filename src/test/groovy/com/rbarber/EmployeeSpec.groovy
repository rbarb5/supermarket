package com.rbarber

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class EmployeeSpec extends Specification implements DomainUnitTest<Employee> {

    def setup() {
    }

    def cleanup() {
    }

    void mergeData() {
	when: "An employee has employeeID, taxCode"

	def emp1 =new Employee (
	employeeID: 'JS86',
	taxCode:'UK123')

	then:"the toString method will merge them."
	emp1.toStringTest()=='JS86,UK123'
    }
}
