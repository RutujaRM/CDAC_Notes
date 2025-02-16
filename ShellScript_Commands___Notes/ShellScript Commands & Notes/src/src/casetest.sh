#!/bin/bash

echo "1.Addition
2.Subtraction
3.Division
4.Multiplication
5.Quit"

read -p "Enter option : " option
read -p "Enter first and second integer: " first second

case $option in								# aA or 1 or number will be there in options
[aA]|1) result=$[first + second];;
[sS]|2) result=$[first - second];;
[dD]|3) result=$[first / second];;
[mM]|4) result=$[first * second];;
[xX]|5) exit 1;;
*) echo "Invalid option";
   exit 2;;
esac

echo "Result = $result"

exit 0









