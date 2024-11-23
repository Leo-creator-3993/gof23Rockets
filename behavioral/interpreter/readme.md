## 解释器(interpreter)模式

### 模式简介
```
解释器模式（Interpreter Pattern）是一种行为型设计模式，通常用于特定语言的解析、表达式求值等问题。
它提供了一种定义语言的文法表示，并通过一个解释器来解释特定上下文中的语言句子或表达式。
这个模式特别适用于需要经常执行的复杂规则的场景，例如 SQL 查询解析器、数学表达式求值器、正则表达式引擎等。

解释器模式的结构
1.表达式接口（Expression)：定义解释操作的方法，通常是 interpret(Context) 方法。
2.终结符表达式（TerminalExpression）：实现 Expression 接口，用于处理文法中的基本元素。一个语法中的每个终结符都需要一个终结符表达式。
3.非终结符表达式（NonTerminalExpression）：实现 Expression 接口，用于表示文法中的非终结符规则，通常是更复杂的表达式，由其他表达式组合而成。
4.上下文类（Context）：包含解释器运行所需要的全局信息。
5.客户端（Client）：构建或解析语言的表达式，并调用解释操作。
```

![img.png](img.png)