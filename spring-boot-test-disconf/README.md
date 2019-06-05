测试DISCONF与SPRING BOOT的集成

### 使用Disconf注解
配置动态更新有效，比如 redis.properties（对应Redis类）

### 在Spring的xml中引用
配置动态更新有效，比如 coefficients.properties（对应Coefficients类）

### 使用Spring的Value注解
配置动态更新无效，比如 remote.properties（对应Remote类）
