(define p (org.apache.tools.ant.Project))
(define classpath (org.apache.tools.ant.types.Path p ".:./build"))

(mkdir "./build")
(javac p "./build" "./src" classpath)
(java p "RunEuler" classpath)
(java p "Palindrome" classpath "ABBA")
(java p "TwoArrays" classpath)
(java p "RemoveChar" classpath "kant k")

