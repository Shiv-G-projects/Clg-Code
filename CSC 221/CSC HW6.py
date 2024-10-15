
#get time in seconds
amount = int( input('enter the time in seconds:   '))
print(' time:' , amount)

#convert seconds to hours and minutes
hours = amount // 3600
minutes = (amount % 3600) // 60
seconds = ( amount % 60 ) // 1

#print results
print('  the number of hours is:  ' , hours )
print('  the number of minutes is:  ' , minutes )
print('  the number of seconds is:  ' , seconds )

