fun main() {
    Integer3()
}
fun Integer3() {

    print("Integer3. Дан размер файла в байтах. Используя операцию деления нацело,\n" +
            "найти количество полных килобайтов, которые занимает данный файл\n" +
            "(1 килобайт = 1024 байта).\n")
    print("Введите размер в байтах:")
    var F_byte = readLine()!!.toInt()
    var full_kilobyte = F_byte/1024
    print("Размер в байтах: $full_kilobyte ")

}
