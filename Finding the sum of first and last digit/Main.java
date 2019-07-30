#include <stdio.h>
#include <math.h>

int main()
{
    int n, firstDigit, lastDigit, digits,sum=0;
    scanf("%d", &n);

    /* Find last digit */
    lastDigit = n % 10;     

    /* Total number of digits - 1 */
    digits = (int)log10(n); 

    /* Find first digit */
    firstDigit = (int)(n / pow(10, digits)); 
    sum=firstDigit+lastDigit;
    printf("%d\n",sum);

	return 0;
}