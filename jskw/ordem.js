function quicksort(arr) {
    if (arr.length <= 1) return arr;
    const pivot = arr[Math.floor(arr.length / 2)];
    const menores = arr.filter(x => x < pivot);
    const iguais = arr.filter(x => x === pivot);
    const maiores = arr.filter(x => x > pivot);
    return [...quicksort(menores), ...iguais, ...quicksort(maiores)];
}


const array = [5, 3, 8, 4, 2, 7, 1, 10];
console.log(`Array ordenado: ${quicksort(array).join(', ')}`);