import java.util.*

class Solution {
    fun combinationSum(candidates: IntArray, target: Int): List<List<Int>> {
        candidates.sort()
        // 动态规划集合
        val t = LinkedList<List<List<Int>>>()
        // 从1开始设置规划集合
        for (i in 1..target) {
            // 第 i 个数的结果
            val lsi = LinkedList<List<Int>>()
            // 直接匹配数据看是否有单一值
            if (candidates.contains(i))
                lsi.add(listOf(i))
            // 遍历动态规划历史
            t.forEach {
                it.forEach {
                    val sum = it.sum()
                    if (candidates.contains(i - sum)) {
                        val x = (it + (i - sum)).sorted()
                        if (!lsi.contains(x))
                            lsi.add(x)
                    }

                }
            }
            t.add(lsi)
        }
        return t.last
    }
}