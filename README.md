# CraftingInterpreters Document

## Scanner类

***作用：***  
对传进来的源文件字符串逐字符进行解析，包括* （ ） + - 字符串，数字，保留字，标识符等的识别。

***备注：***  
所有的数字全部认为是浮点数包括整数， 不对其进行额外的区分，我们只考虑123  123.45此类形式的 不考虑.123 123.此类形式。