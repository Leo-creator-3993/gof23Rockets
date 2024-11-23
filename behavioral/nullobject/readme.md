## null object模式

### 模式简介
```
Null Object模式用于消除程序中对 null 值的显式检查，从而简化代码逻辑并提高代码的可读性和稳定性。

结构
* 抽象类/接口（AbstractClass/Interface）：
定义了目标对象的行为规范。

* 具体类（ConcreteClass）：
实现抽象类或接口，提供具体行为。

* 空对象类（NullObjectClass）：
继承抽象类或实现接口，提供“无操作”或“默认行为”的实现。
```
![img.png](img.png)