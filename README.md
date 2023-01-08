const arrHR = [1, 2, 2, 3, 1, 2];

const elementDiff = (arr) => {
    let arrFinal = [];

    arr.forEach( a => {

        if(!arrFinal.includes(a)) {
            arrFinal.push(a);
        }
    })

    // console.log(arrFinal);
    return arrFinal;
}


const numsDifMenosUno = (arr) => {

    let arrFinal = [];

    let arrDif = elementDiff(arr);

    arrDif.forEach(a => {

        let arrAux = [];

        arr.forEach(b => {

            if(Math.abs(a - b) <= 1) {
                arrAux.push(b)
            }

        })

        arrFinal.push(arrAux)
        
    })
    
    return arrFinal;
}


const compararArrays = (a2) => {
    
    const arrays = numsDifMenosUno(a2);

    for(let i = 0; i < arrays.length; i++) {
        for(let j = 0; j < arrays.length; j++) {

            if(arrays[i]===(arrays[j])) {
                arrays.splice(j, 1)
            }
        }
    }

    let objContador = {};

    for(let i = 0; i < arrays.length; i++) {
        for(let j = 0; j < arrays[i].length; j++) {

            if(!objContador.hasOwnProperty(arrays[i][j])) {
                objContador[arrays[i][j]] = 1;
            } else {
                objContador[arrays[i][j]] += 1;
            }
        }
    }
    console.log(objContador);

    return objContador;
}

const hallarMayor = (arrr) => {

    const objNumeros = compararArrays(arrr);

    const keys = Object.keys(objNumeros);

    let numMayor = 0;
    // let keyMayor = "";
    
    keys.forEach( num => {
        
        if(objNumeros[num] > numMayor) {
            // keyMayor = num;
            numMayor = objNumeros[num];
        }
        
    })

    return parseInt(numMayor);
    
}

console.log(hallarMayor(arrHR));

