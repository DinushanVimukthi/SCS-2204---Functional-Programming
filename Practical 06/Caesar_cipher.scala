def Cipher(Data:String,Algorithm:(Char,Int)=>Char,shift:Int=1):String=Data.map(Algorithm(_,shift))
def Encryption(Letter:Char,shift:Int=1)=(Letter.toInt+shift).toChar
def Decryption(Letter:Char,shift:Int=1)=(Letter.toInt-shift).toChar
@main
def run()={
    val ct=Cipher("Dinushan",Encryption)
    println("Encrpted : "+ct)
    val dt=Cipher(ct,Decryption)
    println("Decrypted : "+dt)
}