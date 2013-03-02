;kant build file
(set-classpath ".:./build")

(mkdir "./build")
(javac "./build" "./src")
(java "RunEuler")
(java "Palindrome" "ABBA")
(java "TwoArrays")
(java "RemoveChar" "kant k")
