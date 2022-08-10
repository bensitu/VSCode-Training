# Java Training

### 第一次配置本地账户信息

#### 全局:

git config --global user.name "[用户名]"
git config --global user.email "[email url]"

#### 非全局:

git config user.name "[用户名]"
git config user.email "[email url]"

#### 使用Git
在当前目录新建一个Git代码库（初始化）
git init

#### 新建一个目录，将其初始化为Git代码库
git init [Project-name]

#### 查看当前状态（在什么分支，哪些文件提交了）
git status

#### 当前目录[文件名]提交到本地暂存区
git add [文件名]
注***所有文件用 git add .

#### 提交本地仓库
git commit -m "备注信息"

#### 链接远程仓库
git remote add [Short name] [GitHub url]
注***[Short name] 多数情况下为origin

#### 提交到远程仓库
git push origin [分支名]
注***初次提交远程仓库可用 git push -u origin [分支名] 来操作，以后就可以只用 git push 就能默认提交

