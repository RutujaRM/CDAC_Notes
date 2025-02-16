#!/bin/bash

pwd1=lion
pwd2=""
i=0
flag=0

while((i < 3))									#Gives User 3 attempts to enter correct password
do
	read -p "Enter password: " pwd2
	if [ "$pwd1" == "$pwd2" ]
	then
		flag=1
		break
	else
		echo "Bad password, Try again!"		
	fi
	((++i))
done

if((flag == 1))									#Flage will become 1 then Access will be Granted
then
	echo "Access granted."
else
	echo "Access denied."
fi

exit 0








