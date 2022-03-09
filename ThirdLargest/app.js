function bblSort(arr){
     
    for(var i = 0; i < arr.length; i++){   
      for(var j = 0; j < ( arr.length - i -1 ); j++){  
        if(arr[j] > arr[j+1]){
          var temp = arr[j]
          arr[j] = arr[j + 1]
          arr[j+1] = temp
        }
      }
    }
    return arr
  }

const prompt = require("prompt-sync")(); 
var seriesString = prompt("Enter the series to find the third largest element . eg. 1 2 4 5 ?");
var series =  seriesString.split(",")
for(var i=0;i>series.length;i++){
series[i] = parseInt(series[i])
}
var series = bblSort(series)
console.log("The third largest number is "+series[2])

