fun main() {

    class stackk {
        val list = mutableListOf<Int>()

        fun add(num: Int) {
            list.add(num)
        }

        fun pop() {
            println(list[0])
            list.removeAt(0)
        }

        fun show() {
            println(list)
        }
    }

    class queueue{
        val list = mutableListOf<Int>()
        fun add(num: Int) {
            list.add(num)
        }
        fun pop(){
            println(list[list.size - 1])
            list.removeAt(list.size - 1)
        }
        fun show(){
            println(list)
        }
    }
    var ourlist = stackk()
    ourlist.add(1)
    ourlist.add(2)
    ourlist.add(3)
    ourlist.add(4)
    ourlist.add(5)
    ourlist.pop()
    ourlist.show()
    var ourlistt = queueue()
    ourlistt.add(5)
    ourlistt.add(4)
    ourlistt.add(3)
    ourlistt.add(2)
    ourlistt.add(1)
    ourlistt.pop()
    ourlistt.show()
    ourlistt.pop()
    ourlistt.show()
}

