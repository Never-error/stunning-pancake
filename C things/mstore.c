//
// Created by WangDake on 2023/3/5.
//

#include <stdio.h>


void multstore(long ,long ,long *);
long mult2(long a,long b);




void multstore(long x, long y ,long *dest){
    long t = mult2(x,y);
    *dest = t;
}

long mult2(long a, long b) {
    long s = a * b;
    return s;
}

