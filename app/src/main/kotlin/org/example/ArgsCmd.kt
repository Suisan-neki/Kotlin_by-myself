//コマンドライン引数を受け取ってその中身だけを表示するプログラム
//まずは名前空間の宣言
//このファイルに書かれたものはorg.exampleという住所に属する
//住所(org.example)が違えば同名(App.kt)でも別人
package org.example

//プログラムの入り口、エントリポイント
//mainのカッコ内はコマンドライン引数の配列
fun runArgs(args: Array<String>) {
    println("args.size = ${args.size}")
    println("args = ${args.joinToString()}")
}

//入力→処理→出力、の最小完全形
