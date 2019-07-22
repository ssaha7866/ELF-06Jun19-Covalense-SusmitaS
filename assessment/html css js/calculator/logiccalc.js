function number(value){
    document.form1.result.value +=value;
}
function cle(value){
    document.form1.result.value =value;
}
function evalua(){
    //var evalu = eval(document.form1.result.value);
    document.form1.result.value = eval(document.form1.result.value);
}
function back() {
    document.form1.result.value =document.form1.result.value.substring(0,document.form1.result.value.length*1 -1)
}