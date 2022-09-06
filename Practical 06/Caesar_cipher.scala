def Cipher(Data:String,Algorithm:(Char,Int)=>Char,shift:Int=1):String=Data.map(Algorithm(_,shift))
def Encryption(Letter:Char,shift:Int=1):Char=Letter match
    case x if x.isLetter && x.isUpper => ((x-65+shift)%26+65).toChar
    case x if x.isLetter && x.isLower => ((x-97+shift)%26+97).toChar
    case x => x
def Decryption(Letter:Char,shift:Int=1):Char=Letter match
    case x if !x.isLetter => x
    case x if x.isLetter && x.isUpper => ((x-65+26-shift)%26+65).toChar
    case x if x.isLetter && x.isLower => ((x-97+26-shift)%26+97).toChar
    case x => x
@main
def run()={
    // val text=Scala.io.StdIn.readLine("Enter the text to be encrypted: ")
    // val shift=Scala.io.StdIn.readLine("Enter the shift: ").toInt
    val text="Dinushanz Vimukthi"
    val shift=1
    val ct=Cipher(text,Encryption,shift)
    println("Encrpted : "+ct)
    val dt=Cipher(ct,Decryption,shift)
    println("Decrypted : "+dt)
}