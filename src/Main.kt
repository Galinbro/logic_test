fun main(args: Array<String>){
    test(3,3)

}


fun test(rows: Int, columns: Int){
    if (columns == 1) {
        if (rows == 1)
            println("R")
        else
            println("D")
    }else if (rows > columns && columns > 1) {
        if (columns % 2 == 0)
            println("U")
        else
            println("D")
    }else if (columns > rows) {
        if (rows % 2 == 0)
            println("L")
        else
            println("R")
    }else if (rows == columns && rows > 1) {
        if (rows % 2 == 0)
            println("L")
        else
            println("R")
    }

}