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
var word1 = prompt("Enter the first word you want to check for anagram?");
var word2 = prompt("Enter the second word you want to check for anagram?");

if(word1.length==word2.length){
  var wordArr1 = word1.split("")
  wordArr1 = bblSort(wordArr1)
  
  var wordArr2 = word2.split("")
  wordArr2 = bblSort(wordArr2)
  
  var check = true
  for(var i = 0; i < word1.length; i++){
    if(wordArr1[i] == wordArr2[i]){
      check  = true
    }else{
      check = false
    }
  }
  if(check){
    console.log("Both words are anagram")
  }else{
    console.log("Both words are not angram")
  }
}else{
  console.log("invaild words.They not of same length")
}




  