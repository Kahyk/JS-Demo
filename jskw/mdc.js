function mdc(a, b) {
    while (b !== 0) {
        let temp = b;
        b = a % b;
        a = temp;
    }
    return a;
}


const num1 = 24;
const num2 = 36;
console.log(`MDC de ${num1} e ${num2}: ${mdc(num1, num2)}`);