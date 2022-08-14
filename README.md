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
_注*** 所有文件用 git add ._

#### 提交本地仓库
git commit -m "备注信息"

#### 链接远程仓库
git remote add [Short name] [GitHub url]
_注*** [Short name] 多数情况下为origin_

#### 提交到远程仓库
git push origin [分支名]
_注*** 初次提交远程仓库可用 git push -u origin [分支名] 来操作，以后就可以只用 git push 就能默认提交_

#### 恢复暂存区的指定文件回工作区（放弃修改）
git checkout [文件名]
_注*** git checkout . 为全部文件_

#### 从远程仓库克隆
git clone [远程仓库url]

#### 从远程仓库抓取
git fetch origin [分支名]

#### 切换至新抓取的仓库
git checkout origin/[分支名]

#### 从远程仓库拉取 (fetch+merge)
git pull origin [分支名]

#### 创建分支
git branch [分支名]

#### 查看分支
git branch -v

#### 将当前分支强制改名为[分支名]
git  branch -M [main]

#### 切换分支
git checkout [分支名]

#### 合并分支
	1. git checkout [被合并的分支名]
	2. git merge [有新内容的分支名]

#### 删除分支
git branch -d [分支名]

#### 查看分支合并图
git log --graph

#### 查看远程仓库链接状态
git remote -v
