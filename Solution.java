int i , j, k, sum, maxSum;
sum = 0; maxSum = arr[0];
   
    int n = arr.length;
 for(i =0;i < n -1; i++){
     
      for(j = i ; j < n; j++){
            sum = 0;
            for(k = i; k < j; k++){
                   sum =  sum + arr[k];
 
                     if(sum > maxSum){
                       maxSum = sum;
                                                   }
                                              }
                                      }
                                 } 
                    print (maxSum);       
