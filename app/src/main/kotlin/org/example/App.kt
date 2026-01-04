//最初の引数を“命令”として解釈して、機能を切り替える入口
//つまりプログラム本体ではなく、交通整理係（ディスパッチャ）
package org.example

//cmd(変数)の部分→配列の0番目を取る、なかったらnull
//rest(変数)の部分→args.drop(1)にて先頭から1個捨てる、残りを配列にする
//Kotlinのdrop(n)はコレクション操作の関数
fun main(args: Array<String>) {
    val cmd = args.firstOrNull() ?: "args"
    val rest = args.drop(1).toTypedArray()

    when (cmd) {
        "args" -> runArgs(rest)
        //"greet" -> runGreet()
        //"calc" -> runCalc()
        "ds" -> runDataStructures(rest)

        else -> println("Unknown command: $cmd (args/greet/calc)")
    }
}
