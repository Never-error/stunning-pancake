#include <stdio.h>
#include "inttypes.h"

typedef unsigned __int128 uint128_t;

void multstore(long ,long ,long *);

void store_uprod(uint128_t *dest,uint64_t x,uint64_t y);

int main(){
    long d;
    multstore(2,3,&d);
    printf("2*3 --> %1d\n",d);
    store_uprod((uint128_t *) d, 2, 3);
    return 0;


}

