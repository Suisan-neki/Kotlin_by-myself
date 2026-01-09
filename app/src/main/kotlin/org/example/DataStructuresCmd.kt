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
    val targetFruit = readLine()?.trim().orEmpty()

    //containsが核心
    //target == "peach"だとする
    //要素数に比例して処理が増える、これが O(n)
    val found = list.contains(targetFruit)

    //list[0] == target ?  → 違う
    //list[1] == target ?  → 違う
    //list[2] == target ?  → 違う
    //list[3] == target ?  → 違う
    //list[4] == target ?  → 違う
    //→ 全部違う → false
    //false が出た = 探索が正しく完了した

    println("見つかった？ $found")

    //Listで探索、Mapで直接取得
    //Mapの作成
    val priceMap = mapOf(
        "apple" to 100,
        "banana" to 80,
        "orange" to 120,
        "grape" to 90,
        "melon" to 150
    )

    println("Map keys = ${priceMap.keys}")

    print("Mapで値段を知りたい果物を入力: ")
    val key = readLine()?.trim().orEmpty()

    val price = priceMap[key]
    println("Mapで取得した値段 = $price")

    // --- Set ---
    //重複を許さない集合を作る
    val seen = mutableSetOf<String>()

    println("Set（重複なし）に値を追加してみる")
    while (true) {
        print("追加する果物（空で終了）: ")
        val input = readLine()?.trim().orEmpty()
        if (input.isBlank()) break

        //追加できたらtrue,すでにあったらfaise
        val added = seen.add(input)
        println(if (added) "追加された" else "すでに存在")
    }

    println("最終的なSet = $seen")

    // --- Sort & Binary Search ---
    val numbers = listOf(5, 3, 9, 1, 7, 2, 8, 4, 6)

    println("before sort = $numbers")

    val sorted = numbers.sorted()
    println("after sort  = $sorted")

    print("探す数値を入力: ")
    val targetNumber = readLine()?.toIntOrNull()

    if (targetNumber == null) {
        println("数値を入力してください")
        return
    }

    val index = sorted.binarySearch(targetNumber)
    println(
        if (index >= 0) "見つかった（index=$index）"
        else "見つからなかった"
    )

}

//何度も探すなら先にソートする価値があるし、1回しか探さないならソートしないほうが速い場合もある
//ソートとは、データを“あるルールに従って並べ替えること”
//詳しくいうと探索や比較を効率化するためにデータの順序を整えること
