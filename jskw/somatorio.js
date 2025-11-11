function somatorio(numeros) {
    let soma = 0;
    for (let i = 0; i < numeros.length; i++) {
        soma += numeros[i];
    }
    return soma;
}


const conjunto = [1, 2, 3, 4, 5];
console.log(`Somatório: ${somatorio(conjunto)}`);