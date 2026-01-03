//App.ktを何も書いていない状態だとrunArgsが認識されなかった
//runArgsを実行するための入り口がないことになるため
package org.example

fun main(args: Array<String>) {
    // いまは最初のプログラム（args表示）だけ動かす
    runArgs(args)
}
