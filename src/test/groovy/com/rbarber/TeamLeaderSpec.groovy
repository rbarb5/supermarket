package com.rbarber

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class TeamLeaderSpec extends Specification implements DomainUnitTest<TeamLeader> {

    def setup() {
    }

    def cleanup() {
    }

    void testEmail(){
	when:"TeamLeader is created with fullName and emailaddress"
	def lea1 = new TeamLeader(fullName:'Jack Hopkinson', leaderEmail: 'JH456@hrsystem.com')
	then: 'Validation should fail'
	!lea1.validate()
}

}
