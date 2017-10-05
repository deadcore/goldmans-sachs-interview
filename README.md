# Goldmans Saches Telephone Interview
Whilst job hunting I participated in a [coderpad](https://coderpad.io/) interview with [Goldmans Saches](http://www.goldmansachs.com/) over the telephone.

## First Question
The first question I was given was a string compactor test. Basically it required me to take a string and concatenate down
the preceding characters of the same type. For example:

* **aabbbcc** would go to **a2b3c2**
* **abc** would go to **a1b1c1**

## Second Question
The second question was to `atoi` a string. 
I'm not going to lie I had never even heard of the word `atoi` before so you know, even if I did'nt get the job [Today I learned](https://igu.io/tag/todayilearned/). 
Anyway I had to quickly work that one out on the fly :sweat_smile:

Basically for those like me who did'nt know:

> Parses the C-string str interpreting its content as an integral number, which is returned as a value of type int.

> The function first discards as many whitespace characters (as in isspace) as necessary until the first non-whitespace character is found. Then, starting from this character, takes an optional initial plus or minus sign followed by as many base-10 digits as possible, and interprets them as a numerical value.

Apparently the following code was not a valid solution :sob:
```
object Atoi {
  val parse = (_:String).toInt
}
```
Not sure why tho because with all due respect that is what I would of done come production code time.