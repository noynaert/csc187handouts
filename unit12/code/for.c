#include <stdio.h>
#include <time.h>
#include <stdlib.h>

int main(int argc, char** argv){
    srand(time(NULL));
 
    for(int i=0; i<10; i++){
        printf("%f\n", (double)rand()/RAND_MAX);
    }
}