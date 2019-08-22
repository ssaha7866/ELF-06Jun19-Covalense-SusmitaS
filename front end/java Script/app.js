/* 
let num=prompt("enter a number"); 
console.log(multiplyNumbers(num));
function multiplyNumbers(num1){
    if (num1 >= 1)
    return num1 * multiplyNumbers(num1 - 1);
else
    return 1;
}
function counter(){
    var counter=0;
    function getCount(){
        counter++;
        return counter;
    }
    return getCount;
}
var count=counter();
let value=count();
console.log(value);
var value1=count();

console.log(value);

var dwightSalary=(function(){
    var salary=600000;
    function changeBy(amount){
        salary+=amount;
    }
    return{
        raise:function(){
        changeBy(5000);
        },
        lower:function(){
            changeBy(-5000);
            },
        currentAmmount:function(){
            return salary;
            }
    };
})();
alert(dwightSalary.currentAmmount());
dwightSalary.raise;
alert(dwightSalary.currentAmmount());
dwightSalary.raise;
alert(dwightSalary.currentAmmount());
/* dwightSalary.changeBy(10000); */ 

/* var pro=new Promise((res,rej)=>{
    const items=[{id:1,name:'susmita'},{id:2,name:'susmi'}];
    if(items.length>7){
        res(items)
    }else{
        rej("rejected");
    }
});

pro.then((data)=>{
    console.log(data);
}).catch((reason)=>{
    console.log(reason);
}); */

var arr1=[1,2,3];
var arr2=[4,5,6];
var arr3=[...arr1, ...arr2];
console.log(arr3);
