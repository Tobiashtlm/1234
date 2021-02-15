package demo
object MinimalApplication extends cask.MainRoutes {
  @cask.get("/")
  def hello() = {
    "Hello World!"
  }
  @cask.get("/fizzbuzz/:number")
  def fizzBuzz(number: Int) = {
    FizzBuzz.fizzBuzz(number)
  }

  @cask.post("/do-thing")
  def doThing(request: cask.Request) = {
    request.text().reverse
  }

  initialize()
}
