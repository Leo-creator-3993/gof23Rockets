---
name: commit-message-generator
description: Generate descriptive and conventional commit messages by analyzing git diffs. Use when the user asks for help writing commit messages or reviewing staged changes.
---

# Commit Message Generator

## Quick Start

当用户需要生成 commit message 时：

1. **查看暂存区的变更**：使用 `git diff --cached` 或 `git status`
2. **分析变更内容**：识别主要改动类型（功能新增、修复 bug、重构等）
3. **生成规范化信息**：遵循 Conventional Commits 格式
4. **提供建议**：给出 1-2 个备选方案供用户选择

## Commit Message 格式

使用以下标准格式：

```
<type>(<scope>): <subject>

<body>

<footer>
```

### Type 类型

| 类型 | 说明 | 示例 |
|------|------|------|
| `feat` | 新功能 | feat(auth): add JWT authentication |
| `fix` | 修复 bug | fix(api): resolve null pointer exception |
| `docs` | 文档更新 | docs(readme): update installation guide |
| `style` | 代码格式调整 | style(format): fix indentation |
| `refactor` | 重构代码 | refactor(service): extract validation logic |
| `test` | 测试相关 | test(unit): add edge case tests |
| `chore` | 构建/工具配置 | chore(deps): upgrade dependencies |

## 生成步骤

### 1. 分析变更

```bash
# 查看暂存区变更
git diff --cached --stat

# 查看详细变更内容
git diff --cached
```

### 2. 识别变更模式

根据文件变更识别类型：
- **新增功能文件** → `feat`
- **修复错误逻辑** → `fix`
- **修改注释/文档** → `docs`
- **仅调整格式** → `style`
- **结构调整无功能变化** → `refactor`
- **新增/修改测试** → `test`
- **配置文件/依赖** → `chore`

### 3. 编写 Subject

Subject 写作要点：
- ✅ 使用祈使句现在时（"add" 不是 "added"）
- ✅ 首字母小写（除非是专有名词）
- ✅ 不超过 50 个字符
- ✅ 不要以句号结尾
- ✅ 清晰简洁描述变更目的

### 4. 编写 Body（可选）

Body 用于复杂变更：
- 解释**为什么**做这个改动（不是**做了什么**）
- 每行不超过 72 个字符
- 可以包含多段说明

### 5. 添加 Footer（可选）

Footer 用于：
- 关联 Issue：`Closes #123`
- 破坏性变更：`BREAKING CHANGE: ...`
- 作者信息：`Co-authored-by: ...`

## 示例

### 示例 1：新增功能

**输入**：新增了用户登录接口和 JWT 验证中间件

**输出**：
```
feat(auth): implement user login with JWT

Add login endpoint at /api/auth/login and token 
validation middleware for protected routes.

Closes #45
```

### 示例 2：修复 Bug

**输入**：修复了日期格式化在跨时区时的错误

**输出**：
```
fix(reports): correct date formatting across timezones

Use UTC timestamps consistently to avoid timezone 
conversion issues in report generation.

Fixes #78
```

### 示例 3：重构代码

**输入**：将 UserService 中的验证逻辑提取为独立类

**输出**：
```
refactor(user): extract validation logic to separate class

Move email and password validation rules from 
UserService to UserValidator for better separation 
of concerns.
```

### 示例 4：文档更新

**输入**：更新了 README 中的安装步骤

**输出**：
```
docs(readme): update installation instructions

Add detailed steps for Maven and Gradle setup, 
including dependency snippets for both build tools.
```

## 最佳实践

### ✅ 好的做法

- **具体明确**：说明改动的具体内容和目的
- **使用技术术语**：准确描述技术实现
- **包含上下文**：说明改动影响的模块范围
- **关联 Issue**：有相关的 Issue 时要引用

### ❌ 避免的做法

- **过于笼统**："fix bug", "update code"
- **缺少上下文**：不说清楚为什么改动
- **格式混乱**：不遵循约定格式
- **过于冗长**：subject 超过 50 字符

## 工作流程

当用户请求生成 commit message 时：

1. **检查暂存区**：确认有已暂存的变更
2. **分析变更内容**：阅读 diff 了解改动性质
3. **判断变更类型**：确定是 feat/fix/docs/refactor 等
4. **生成候选消息**：提供 1-2 个完整格式的消息
5. **等待用户确认**：让用户选择或修改

## 工具和命令

```bash
# 查看暂存区变更概览
git diff --cached --stat

# 查看暂存区详细变更
git diff --cached

# 查看未暂存的变更
git diff

# 查看最近提交历史（参考风格）
git log --oneline -5
```

## 特殊情况处理

### 多个不相关的变更

如果发现暂存区包含多个不相关的改动：

```
检测到多个独立的变更：
1. 用户认证模块的新功能
2. 报告模块的 bug 修复

建议拆分为两个提交：
- feat(auth): add user login functionality
- fix(reports): correct date formatting issue

是否需要我分别为每个变更生成 commit message？
```

### 破坏性变更

如果有 API 不兼容改动：

```
feat(api): migrate to v2 authentication endpoint

BREAKING CHANGE: The /api/v1/auth endpoint is now 
deprecated. Clients must use /api/v2/auth with updated 
request format.

Migration guide: [link]
```

## 参考资源

- [Conventional Commits 规范](https://www.conventionalcommits.org/)
- [Git Commit Message 最佳实践](https://cbea.ms/git-commit/)
- [如何写好 Commit Message](https://stackoverflow.blog/2009/06/30/how-to-write-a-git-commit-message/)
