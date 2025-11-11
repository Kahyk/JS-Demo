function contagem(conjunto, N) {
    if (N > conjunto.length) N = conjunto.length;
    let contador = 0;
    for (let i = 0; i < N; i++) {
        if (Number.isInteger(conjunto[i])) {
            contador++;
        }
    }
    return contador;
}

const dados = [1, 2.5, 3, 4, 'a', 5, 6.7];
const N = 5;
console.log(`Quantidade de inteiros entre o primeiro e o ${N}º dado: ${contagem(dados, N)}`);