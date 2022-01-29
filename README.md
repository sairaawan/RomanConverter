# RomanConverter

Convert integers into Roman


numbers:{1, 2, 3, 4, 5, 6, 7, 8, 9, 10,…,3000}
romans: {I, II, III, IV, V, VI, VII, VIII, IX, X,….,MMM}

Change in symbolsz
numbers = { 900,  400,  90, 40,    9,   4,    1 };

letters = { "CM", "CD", "XC", "XL", "IX",  "IV", "I" };

# Unit, tens, hundred, thousand

Remember
0=Empty String
1=I
10=X
100=C
1000=M

# Understand the pattern

1=I
11=XI =>10+1=X+I=XI
101=CI=>100+0+1=C+Empty string+I
1001=MI


# Steps:

1.	Create each array for units, tens, hundreds and thousands => 4 arrays
2.	Write the formula to find correct roman value against each value

Thousands:
 {"", "M", "MM", "MMM"};

Hundreds:
 {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "DM"};

Tens:

{"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};

Units:
{"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"}

# Formula:
 thousands[num/1000]+hundreds[(num%1000)/100]+tens[(num%100)/10]+units[num%10];

num=15
thousands[15/1000]+hundreds[(15%1000)/100]+tens[(15%100)/10]+units[15%10];

thousands[0]+hundreds[0]+tens[1]+units[5]=>XV

# example: 15

 thousands[15/1000]=thousands[0]= “empty string”
hundreds[(15%1000)/100]=hundreds[0]= “empty string
tens[(15%100)/10]=tens[15/10]=tens[1]=X
units[15%10]=units[5]=V
result=  empty string+ empty string+X+V=XV
