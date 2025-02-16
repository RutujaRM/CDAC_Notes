#!/bin/bash

pwd1=lion
pwd2=""
i=0
flag=0

for((i=0;i < 3;++i))							#Gives User 3 attempts to enter correct password
do
	read -p "Enter password: " pwd2
	if [ "$pwd1" == "$pwd2" ]
	then
		flag=1
		break
	else
		echo "Bad password, Try again!"		
	fi
done

if((flag == 1))
then
	echo "Access granted."
else
	echo "Access denied."
fi

exit 0








