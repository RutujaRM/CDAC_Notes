#!/bin/bash

hours=0
rate=0

: '
echo "Enter hours = "
read hours
echo "Enter rate = "
read rate
'

: '
echo -n "Enter hours = "			#-n     do not output the trailing newline
read hours
echo -n "Enter rate = "
read rate
'

read -p "Enter hours = " hours		#-p to have the cursor on the same line
read -p "Enter rate = " rate

income=`expr $hours \* $rate`

echo "Income = $income"

exit 0






