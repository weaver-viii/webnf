(defproject webnf/server "0.0.3"
  :description "Vhost functionality with servlets and a jetty runner"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[webnf/base "0.0.3"]
                 [ring/ring-servlet "1.2.0"
                  :exclusions [javax.servlet/servlet-api]]
                 [org.eclipse.jetty/jetty-servlet "9.0.5.v20130815"]
                 [org.eclipse.jetty/jetty-webapp "9.0.5.v20130815"]])