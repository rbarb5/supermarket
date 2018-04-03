package com.rbarber

class Shift {

String timeOfDay
String dayOfWeek
Integer numberOfHours
Double startingTime

static hasMany = [task:Task, team:Team]
static belongsTo = [Team,Task,Employee]

String toString()
{
	return "$dayOfWeek : $timeOfDay"
}


    static constraints = {

timeOfDay blank: false, nullable:false
dayOfWeek blank: false, nullable:false, inList:["Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"]
numberOfHours blank: false, nullable:false
startingTime blank: false, nullable:false, min:0d, max:24d
    }
}
