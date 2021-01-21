package ru.netology.lesson2

fun main() {

    var currentBuy = 100*100    //Текущая сумма покупки (не может быть меньше 100 рублей)
    var sum: Long = 10_001*100  //Предыдущая сумма покупок
    val saleCard1Percent = true //Наличие скидочной карты 1%

    val rangeLow1 = 0
    val rangeTop1 = 1_000*100
    val rangeLow2 = 1_001*100
    val rangeTop2 = 10_000*100
    val rangeLow3 = 10_001*100

    val sale100r = 100*100
    val sale5Percent = 5

    val minCurrentBuy = 100*100

    if ((currentBuy <= minCurrentBuy)&&(sum >= rangeLow2 && sum <= rangeTop2))  {
        println("Сумма покупки меньше или равно 100 руб, " +
                "поэтому при скидке в 100 рублей возникнет отрицательное значение.")
        return
    }

    if (sum >= rangeLow1 && sum <= rangeTop1) {

        sum = sum + currentBuy
        println("Предыдущая сумма покупок от 0 до 1 000, поэтому никакой скидки нету.")
        println("Покупка: $currentBuy копеек ")

    } else if (sum >= rangeLow2 && sum <= rangeTop2){

        println("Предыдущая сумма покупок от 1 001 до 10 000, поэтому стандартная скидка 100 рублей.")
        println("Покупка: $currentBuy копеек ")
        currentBuy = currentBuy - sale100r
        sum = sum + currentBuy
        println("После применения скидки 100 руб: $currentBuy копеек ")
        if (saleCard1Percent){
            currentBuy = currentBuy - (currentBuy/100)
            println("После применения скидки 1% руб: $currentBuy копеек ")
        }

    } else if (sum >= rangeLow3) {

        println("Предыдущая сумма покупок от 10 001 и выше, поэтому скидка составляет 5% от суммы.")
        println("Покупка: $currentBuy копеек ")
        currentBuy = currentBuy - (currentBuy*sale5Percent/100)
        println("После применения скидки 5% руб: $currentBuy копеек ")
        if (saleCard1Percent){
            currentBuy = currentBuy - (currentBuy/100)
            println("После применения скидки 1% руб: $currentBuy копеек ")
        }
        sum = sum + currentBuy
    }


}