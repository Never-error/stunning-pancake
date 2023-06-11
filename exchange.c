//
// Created by WangDake on 2023/3/5.
//
long exchange(long *xp,long y){
    long x = *xp;
    *xp = y;
    return x;
}