// COMP2850 Portfolio: Week 4
// ToDoList class

import kotlinx.datetime.LocalDate
//import kotlin.io.path.Path
//import kotlin.io.path.forEachLine
//import kotlin.io.path.writer
import kotlin.io.path.*
import kotlin.io.bufferedReader
import kotlin.text.split

class ToDoList() {
    private val items = mutableListOf<ToDoItem>()

    val size get() = items.size
    val notStarted get() = items.filter{it.status == ItemStatus.NotStarted}.size  // compute no. of items with NotStarted status
    val inProgress get() = items.filter{it.status == ItemStatus.InProgress}.size   // compute no. of items with InProgress status
    val done get() = items.filter{it.status == ItemStatus.Done}.size      // compute no. of items with Done status
    val overdue get() = items.filter{it.isOverdue()}.size      // compute no. of overdue items

    constructor(filename: String): this() {
        load(filename)
    }

    fun load(filename: String) {
        // Implement code to read To Do list from a file here
        // See data/to-do.csv for an example of the format
        var filePath = Path(filename)
        var fileContent = filePath.readLines()
        for(it in fileContent){
            var args = it.split(": ")
            var args1Status: ItemStatus = ItemStatus.NotStarted
            if(args[1] == ItemStatus.NotStarted.name){
                args1Status = ItemStatus.NotStarted
            }   
            else if(args[1] == ItemStatus.InProgress.name){
                args1Status = ItemStatus.InProgress
            }
            else if(args[1] == ItemStatus.Done.name){
                args1Status = ItemStatus.Done
            }
            var lineItem: ToDoItem = ToDoItem(LocalDate.parse(args[0]), args1Status, args[2])
            items.add(lineItem)
        }
    }

    fun save(filename: String) {
        Path(filename).writer().use {
            for (item in items) {
                it.write("$item\n")
            }
        }
    }

    fun add(vararg item: ToDoItem) = item.forEach { items.add(it) }

    fun deleteDone(): Boolean {
        // Write code here to remove items with status of Done
        // Return true if any were removed, false if none were removed
        var itemcount = items.size
        var itemsToRemove = mutableListOf<ToDoItem>()
        for(item in items){
            if(item.status == ItemStatus.Done){
                itemsToRemove.add(item)
            }
        }
        for(item in itemsToRemove){
            items.remove(item)
        }

        if(items.size != itemcount){
            return true
        }
        else{
            return false
        }
    }

    fun getItems(status: ItemStatus? = null): List<ToDoItem> {
        // Write code here to return a list of items with the matching
        // status, or a list of all items if status argument is null
        if(status == null){
            return items
        }
        else{
            val itemsList = buildList{
                for(item in items){
                    if(item.status == status){
                        add(item)
                    }
                }
            }
            
            return itemsList
        }
    }

    fun getItemsDueOn(date: LocalDate): List<ToDoItem> {
        // Write code here to return a list of items
        // that are due on the specified date
        val itemsList = buildList{
            for(item in items){
                if(item.dueDate == date){
                    add(item)
                }
            }
        }
        
        return itemsList
    }
}
