package recfun

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
    def pascal(c: Int, r: Int): Int = {

      var value = 0
      if(r == 0 || c == 0){
        value = 1
      } else if( c==r ){
        value = 1
      } else {
        value = pascal(c,r-1)+pascal(c-1,r-1)
      }

      value
    }
  
  /**
   * Exercise 2
    */

    def balance(chars: List[Char]): Boolean = {
      var count = 0

      for(e <- chars){
        if(e == '(') count += 1
        if(e == ')') count -= 1
        if(count <0) return false
      }
      if(count == 0)  true
      else false
    }

  /**
    * Exercise 2

  def balance(chars: List[Char]): Boolean = {

    def go_on (count: Int, things: List[Char]): Boolean = {
      if (count < 0)
        false
      else if (things.isEmpty)
        if (count == 0)
          true
        else
          false

      else if (things.head == '(')
        go_on(count + 1, things.tail)
      else if (things.head == ')')
        go_on(count - 1, things.tail)
      else
        go_on(count    , things.tail)
    }

    if (chars.isEmpty)
      throw new NoSuchElementException
    else
      go_on (0, chars)
  }
    */

  /**
   * Exercise 3
   */
    def countChange(money: Int, coins: List[Int]): Int = {


      if(money < 0 || coins.isEmpty ){
         0
      }else if(money == 0){

         1
      }else{

         countChange(money - coins.head, coins) + countChange(money , coins.tail)
      }






    }
  }
