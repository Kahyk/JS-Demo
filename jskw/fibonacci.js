function fibonacci(n) {
    if (n <= 1) return [0];
    let seq = [0, 1];
    for (let i = 2; i < n; i++) {
        seq.push(seq[i - 1] + seq[i - 2]);
    }
    return seq;
}


const N = 3;
console.log(`Fibonacci até o ${N}º termo: ${fibonacci(N).join(', ')}`);