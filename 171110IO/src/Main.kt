import java.io.File
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main(args: Array<String>) {
    val file = File("${System.nanoTime()}")
    if (!file.exists()) file.createNewFile()
    val osf = OutputStreamWriter(file.outputStream(), Charsets.UTF_8.name())
    osf.write("今天星期五，阴天")
    osf.flush()
    osf.close()
    val osi = InputStreamReader(file.inputStream(), Charsets.UTF_8.name())
    println(osi.readText())
    osi.close()

    println(String("今天星期五，阴天".toByteArray(), Charsets.UTF_16))

    val li = listOf<Int>(2, 3, 6, 7)
    println(li + 7)
    println(li)
    println((1..7).toList())
    println(Solution().combinationSum(li.toIntArray(), 7))
}

