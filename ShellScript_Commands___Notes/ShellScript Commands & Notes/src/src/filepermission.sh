#!/bin/bash

len=$#		# $# DEFAULT VARIABLE to see the number of Argument which are passed
if((len < 1))
then
	echo "USAGE: $0 <filename>"
	exit 1
fi

filename=$1

if [ ! -e $filename ]			# ! -e will check the given file exist in the directory or not
then
	echo "ERROR: $filename does not exist."
	exit 2
fi

permission=`ls -l $filename | cut -c2-4`  #rw-

i=1
while((i <= 3))
do
	p=`echo $permission | cut -c$i`
	case $p in
	r) echo "READ";;
	w) echo "WRITE";;
	x) echo "EXUCUTE";;
	esac

	((++i))
done

exit 0













