function isPalindrome(str) {
   var cleaned = str.toLowerCase();

    // var reversed=cleaned.split('').reverse().join('');
    for(let i=str.length-1;i>=0;i--){
        let reversed=reversed+cleaned[i]
    }
    if(cleaned==reversed){
        console.log(str+" is palindrome");
    }else{
        console.log(str+" is not a palindrome")
    }
    
}
isPalindrome("madam")