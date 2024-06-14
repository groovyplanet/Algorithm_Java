#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int n) {
    int answer = 0;
    int sum = 1;
    int max = 0;
    for(int i=1; i<=n; i++){
        sum*=i;
        if(sum<=n){
            max=i;
        }else {
            break;
        }
           answer=max;
}
return answer;
}
    
