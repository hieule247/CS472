function fontBigger2px(){
    var txtInput = document.getElementById("txtInput");
    var curFontSize = txtInput.style.fontSize;
    if(curFontSize && parseInt(curFontSize) < 30)
    {
        txtInput.style.fontSize = (parseInt(curFontSize) + 2) + "px";
    } else 
    {
        txtInput.style.fontSize = "12px";  
    }
}     

function onclickBigger(){
    // var txtInput = document.getElementById("txtInput");
    // txtInput.style.fontSize = "24px";
    // Set Timer
    let hasTimer = null;
    if (hasTimer === null) {
        hasTimer = setInterval(fontBigger2px, 5000);
    }
    else {
        clearInterval(hasTimer);
        hasTimer = null;
    }
}

function onBling(){
    // get checkbox value
    var chkBling = document.getElementById("chkBling");
    var txtInput = document.getElementById("txtInput");
    // $("chkBling").attr("");
    if (chkBling.checked == true)
    {
        txtInput.style.fontWeight       = "900";
        txtInput.style.color            = "green";
        txtInput.style.textDecoration   = "underline"; 
    }
    else {
        txtInput.style.fontWeight       = "normal";
        txtInput.style.color            = "black";
        txtInput.style.textDecoration   = "none"; 
    }  



}
