function primos(){
    let inputValueP = document.getElementById("valueP");
    let endPoint = "/primes?value=" + inputValueP.value;
    let llamado = llamarAPI(endPoint);
    llamado.then((resultado)=>{
        let divrespuestaP = document.getElementById("respuestaP");
        divrespuestaP.innerHTML = resultado;

    });
}

function factorial(){
    let inputValueF = document.getElementById("valueF");
    let endPoint = "/factors?value=" + inputValueF.value;
    let llamado = llamarAPI(endPoint);
    llamado.then((resultado)=>{
        let divRespuestaF = document.getElementById("respuestaF");
        divRespuestaF.innerHTML = resultado;
    })
}

async function llamarAPI(endPoint){
    return await fetch(window.location.origin + endPoint)
    .then((responder)=>{
        if(!responder.ok){
            throw new Error();

        }
        return responder.text();
    })
    .catch((error)=> alert(error));

}

