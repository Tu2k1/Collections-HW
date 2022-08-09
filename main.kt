fun main() {
    
    // Read-only (immutable)
    val names = listOf("Ahad", "Turki", "Raghad", "Nasser", "Sumayah", "Fahdah")
    val namesAll = listOf("Ahad", "Turki", "Raghad", "Nasser")
    val color = listOf<String>()
    
    // Read and Write (mutable)
    val numbers = mutableListOf("one", "two", "three", "four", "five")
    val weekDays = mutableListOf("Sun", "Mon", "Tue", "Wed", "Thurs", "Fri", "Sat")

    
    // Read-Write (mutable) List - Operations
    
    
    // Add (Element)
    println("Before adding six: $numbers")
    numbers.add("six")
    println("After adding six: $numbers\n\n")
   	
    // Add (Index, Element)
    println("Before adding four in index 2: $numbers")
    numbers.add(2,"four")
    println("After adding four in index 2: $numbers\n\n")
   	
    // Add All (List)
    println("Before adding weekDays list: $numbers")
    numbers.addAll(weekDays)
    println("Before adding weekDays list: $numbers\n\n")
    // Add All (Index, List)
    println("Before adding numbers list in index 3: $weekDays")
    weekDays.addAll(3,numbers)
    println("after adding numbers list in index 3: $weekDays\n\n")
   
    // Remove
    println("Before removing three from numbers: $numbers")
    numbers.remove("three")
    println("after removing three from numbers: $numbers\n\n")
    // Remove At 
    println("Before removing at index 4 from numbers: $numbers")
    numbers.removeAt(4)
    println("after removing at index 4 from numbers: $numbers\n\n")
    // Remove All
    println("Before removing numbers list from weekDays: $weekDays")
   	weekDays.removeAll(numbers)
    println("After removing numbers list from weekDays: $weekDays\n\n")
    // Clear 
    numbers.clear()
    weekDays.clear()
    println("numbers list after clear: $numbers")
    println("weekDays list after clear: $weekDays\n\n")
    println("---------------------------------------------------------\n\n")
    // Read-only (immutable) List - Operations
     
     
    // The size of the list
    println("the size of names list: ${names.size}\n")
    // Contains
   	println("does names list contains Ali? : ${names.contains("Ali")}\n")
    // Contains All
   	println("does names list namesAll list? : ${names.containsAll(namesAll)}\n")
    // get
   	println("the item in the index 3 is ${names.get(3)}\n")
    // indexOf
    println("the index of item Nasser is ${names.indexOf("Nasser")}\n")
    // isEmpty
    println("is the color list empty? : ${color.isEmpty()}\n")
    // Sublist
    println("the sublist from index 1 to index 4 from names list is ${names.subList(1,5)}\n")
    
}
