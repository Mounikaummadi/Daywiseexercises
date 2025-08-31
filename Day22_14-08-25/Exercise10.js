function sumOfNums(...args){
    const result=args.reduce((result,num)=>result+num);
    console.log(result)
}
var nums=[1,2,3,4];
sumOfNums(...nums);