package org.example
//果物のリストを用意して、ユーザーが入力した文字列が その中に含まれているかを順番に調べるプログラム
fun runDataStructures(args: Array<String>) {
    val list = listOf("apple", "banana", "orange", "grape", "melon")

 //今どんなデータを持っているか、を可視化するだけ
    //中身をそのまま表示
    println("List = $list")
    //要素数(ここでは5)
    println("List size = ${list.size}")

    //標準入力を受け取る
    print("探したい要素を入力: ")
    //ここは安全装置
    val target = readLine()?.trim().orEmpty()

    //containsが核心
    //target == "peach"だとする
    //要素数に比例して処理が増える、これが O(n)
    val found = list.contains(target)

    //list[0] == target ?  → 違う
    //list[1] == target ?  → 違う
    //list[2] == target ?  → 違う
    //list[3] == target ?  → 違う
    //list[4] == target ?  → 違う
    //→ 全部違う → false
    //false が出た = 探索が正しく完了した

    println("見つかった？ $found")
}

