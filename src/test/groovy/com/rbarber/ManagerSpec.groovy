package com.rbarber

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class ManagerSpec extends Specification implements DomainUnitTest<Manager> {

    def setup() {
    }

    def cleanup() {
    }

    void mergeData() {
	when: "A manager has office, department."

	def man1 =new Manager (
	office: 'Big Office',
	department:'IT')

	then:"the toStringTestManager method will merge them."
	man1.toStringTestManager()=='Big Office,IT'
    }
}
