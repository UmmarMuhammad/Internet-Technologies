/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
function myFunction3()
{
    document.getElementById("para3").innerHTML = "Paragraph changed from script file.";
}
function newFunction()
{
    var l = "love you";
    document.write(l);
    console.log(l);
}
function newFunction2()
{
    var l = "love you";

    window.alert(l);

}
function newFunction3()
{
    var l = "love you";

    console.log(l);
}

function validateForm() {
    var x = document.forms["intTech"]["num1"].value;
    console.log(x);
    if (x < 7) {
        window.alert("1st No. must be greater than 7.");
        return false;
    }
}