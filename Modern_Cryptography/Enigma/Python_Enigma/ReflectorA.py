#Reflector A

alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
reflector = "EJMZALYXVBWFCRQUONTSPIKHGD"

def reflect(letter):
    spot = alphabet.find(letter)
    return reflector[spot]

