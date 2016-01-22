
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/saksham/workspace/web-analyzer/conf/routes
// @DATE:Wed Jan 20 10:26:32 PST 2016


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
