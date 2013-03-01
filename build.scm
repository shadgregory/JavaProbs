(define p (org.apache.tools.ant.Project))
(define classpath (org.apache.tools.ant.types.Path p ".:./lib/ant.jar:./lib/kawa.jar"))

(mkdir "./build")
(javac p "./build" "./src" classpath)
(java p "RunEuler" classpath)
(java p "Palindrome" classpath "ABBA")
