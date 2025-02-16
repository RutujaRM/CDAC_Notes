#!/bin/bash

for num in 1 2 3 12.7 Jack Jill
do
	echo $num
done

echo "--------"

for var in $@			#capture arg from cmd $@ for specific args use $1 $2 $3 ....etc
do
	echo $var
done

exit 0




