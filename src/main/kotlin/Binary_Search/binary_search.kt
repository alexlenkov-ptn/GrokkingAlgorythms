package org.example.Binary_Search

fun main() {
    val list: List<Int> = listOf(1, 3, 5, 6, 8, 10, 12, 14, 18, 20, 21, 35, 36)
    println(binarySearch(list, 36))
}

fun binarySearch(list: List<Int>, item: Int): Int? {
    list.sorted()
    var low = 0
    var high = list.size
    var mid: Int
    var guess: Int
    while (low <= high) { // Проверяем элемент пока эта часть не сократится до одного элемента
        mid = (low + high) / 2 // находим позицию середины списка
        guess = list[mid] // вытаскиваем этот элемент
        if (guess == item) {
            return mid
        } else if (guess > item) { // Если число, которое мы нашли больше загадываемого, то верхняя граница ниже
            // ниже мида
            high = mid - 1
        }else {
            low = mid + 1
        }
    }
    return null
}