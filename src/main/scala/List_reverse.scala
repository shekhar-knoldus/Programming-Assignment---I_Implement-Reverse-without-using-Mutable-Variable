object List_reverse {
val name =List("Shekhar", "Shashank","Shashi", "Sachin","Deepak")
  def new_List(name : List[String]):List[String]={
    if(name==List())
    {
      name
    }
    else{
     new_List(name.tail):+ name.head
    }
  }
  def main(args: Array[String]): Unit = {
    println("List Before Reversing is : " +name)
   val list_reversed= new_List(name)
    println("List after Reversing  is :  " +list_reversed)
  }
}
