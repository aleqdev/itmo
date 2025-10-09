def fib2dec(fib_str):
    fib_str = str(fib_str).strip()

    fib = [1, 2]
    while len(fib) < len(fib_str):
        fib.append(fib[-1] + fib[-2])

    result = 0
    for i in range(len(fib_str)):
        if fib_str[i] == '1':
            result += fib[len(fib_str) - 1 - i]

    return result

def dec2fib(num):
    num = int(num)

    fib = [1, 2]
    while fib[-1] <= num:
        fib.append(fib[-1] + fib[-2])

    fib = fib[:-1]
    result = ['0'] * len(fib)
    remaining = num

    for i in range(len(fib) - 1, -1, -1):
        if fib[i] <= remaining:
            result[i] = '1'
            remaining -= fib[i]

    result.reverse()

    fib_str = ''.join(result).lstrip('0')

    return fib_str if fib_str else '0'


print(fib2dec("100000"))
print(dec2fib(fib2dec("100000")))
