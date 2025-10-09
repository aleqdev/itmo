msg = input()

codes = [int(char) for char in msg]

s1 = (codes[0] + codes[2] + codes[4] + codes[6]) % 2
s2 = (codes[1] + codes[2] + codes[5] + codes[6]) % 2
s3 = (codes[3] + codes[4] + codes[5] + codes[6]) % 2

errorNumber = s1 + s2 * 2 + s3 * 4

if errorNumber == 0:
    print(f"Сообщение верно: {msg[2]}{msg[4]}{msg[5]}{msg[6]}")
else:
    wrong_index = errorNumber - 1
    real_number = (codes[wrong_index] + 1) % 2
    corrected_msg = list(msg)
    corrected_msg[wrong_index] = str(real_number)
    corrected_msg = ''.join(corrected_msg)
    print(f"Ошибка в сообщении на месте {errorNumber}, реальное сообщение {corrected_msg}")
