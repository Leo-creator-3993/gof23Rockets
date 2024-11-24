## 策略(strategy)模式

### 模式简介
```
策略模式（Strategy Pattern）用于在运行时选择不同的算法或行为，而无需修改使用算法的上下文类。
这种模式将算法的定义和使用分离，使得代码更加灵活和易于维护。

- 结构
* 策略接口（Strategy Interface）：
定义了一个共同的接口，所有具体策略类必须实现它。

* 具体策略类（Concrete Strategy Classes）：
实现策略接口，提供不同的算法实现。

* 上下文类（Context Class）：
持有策略接口的引用，根据具体策略执行相应的算法。
```

![img.png](img.png)
