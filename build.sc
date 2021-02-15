import mill._, scalalib._

val utestVersion = "0.7.5"

object lule extends ScalaModule {
  def scalaVersion = "2.13.4"
  def ivyDeps = Agg(ivy"com.lihaoyi::cask:0.7.5")

  object test extends Tests {
    def testFrameworks = Seq("utest.runner.Framework")

    def ivyDeps =
      Agg(
        ivy"com.lihaoyi::utest::$utestVersion"
      )
  }
    // optional
  def scalacOptions = Seq("-deprecation", "-encoding", "utf-8")
  //def mainClass = Some("lesson02.chess.ChessGuiMain")
  def mainClass = Some("demo.MinimalApplication")
}