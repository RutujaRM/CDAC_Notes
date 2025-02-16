#!/bin/bash

hours=0
rate=0

read -p "Enter hours = " hours
read -p "Enter rate = " rate

ot=$[hours - 180]
income=`expr $hours \* $rate`

if [ $ot -gt 0 ]
then
	income=$[income + 50 * ot]
fi

echo "Income = $income"

exit 0






